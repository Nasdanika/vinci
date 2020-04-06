package org.nasdanika.vinci.presentation.cli;

import java.io.ByteArrayOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;
import org.nasdanika.common.resources.Container;
import org.nasdanika.html.HTMLPage;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
import org.nasdanika.vinci.bootstrap.BootstrapPage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
		description = "Generates Eclipse help from a Vinci action model",
		name = "eclipse-help",
		versionProvider = VinciBundleVersionProvider.class)
public class GenerateEclipseHelpCommand extends GenerateTemplatedApplicationCommand {

	@Option(names = {"-l", "--label"}, description = "TOC label")
	private String label;
	
	@Option(names = {"-L", "--link-to"}, description = "Anchor to link this toc to")
	private String linkTo;
	
	@Override
	protected void generatePages(
			Context generationContext, 
			ResourceSet resourceSet, 
			Action rootAction,
			Action activeAction, 
			Container<Object> contentContainer, 
			ProgressMonitor monitor) throws Exception {
		
		monitor.setWorkRemaining(2);
		super.generatePages(generationContext, resourceSet, rootAction, activeAction, contentContainer, monitor.split("Generating topics", 1));
		generateToc(rootAction, contentContainer, monitor.split("Generating toc.xml", 1));		
	}
	
	protected void generateToc(
			Action rootAction,
			Container<Object> contentContainer, 
			ProgressMonitor monitor) throws Exception {
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document toc = dBuilder.newDocument();
		
		Element root = toc.createElement("toc");			
		toc.appendChild(root);
		if (!Util.isBlank(label)) {
			root.setAttribute("label", label);			
		}
		if (!Util.isBlank(linkTo)) {
			root.setAttribute("link_to", linkTo);			
		}
		
		Element actionTopic = createActionTopic(toc, rootAction);
		if (actionTopic != null) {
			root.appendChild(actionTopic);
		}
		
	    // Use a Transformer for output
	    TransformerFactory tFactory = TransformerFactory.newInstance();
	    Transformer transformer = tFactory.newTransformer();
	    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	    
	    DOMSource source = new DOMSource(toc);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    StreamResult out = new StreamResult(baos);
	    transformer.transform(source, out);
		baos.close();
		
		try (ProgressMonitor contentMonitor = monitor.split("Writing toc.xml", 1)) {
			contentContainer.put("toc.xml", baos.toByteArray(), contentMonitor);
		}
	}
	
	private Element createActionTopic(Document document, Action action) {
		ActionActivator activator = action.getActivator();
		if (activator instanceof NavigationActionActivator) {					
			NavigationActionActivator naa = (NavigationActionActivator) activator;
			String url = naa.getUrl();
		
			Element topic = document.createElement("topic");
			topic.setAttribute("label", action.getText());
			topic.setAttribute("href", url);
			
			for (Action child: action.getNavigationChildren()) {
				Element cTopic = createActionTopic(document, child);
				if (cTopic != null) {
					topic.appendChild(cTopic);
				}
			}
			return topic;
		}
		return null;
	}

	/**
	 * Generates action page
	 * @param page
	 * @param url
	 * @param contentContainer
	 * @param pageContext
	 * @param monitor
	 * @throws Exception
	 */
	@Override
	protected void generatePage(
			Action action,
			BootstrapPage page, 
			String url, 
			Container<Object> contentContainer, 
			Context context, 
			ProgressMonitor monitor) throws Exception {
		
		page = EcoreUtil.copy(page);
		page.getBuilders().clear(); // Templates contain application builders which we don't need.
		
		try (Supplier<Object> pageWork = page.create(context)) {
			try (ProgressMonitor pageMonitor = monitor.split("Generating page", 1)) {
				pageMonitor.setWorkRemaining(pageWork.size() *2 + 2);						

				org.nasdanika.common.Diagnostic diagnostic = pageWork.splitAndDiagnose(pageMonitor);
				if (diagnostic.getStatus() == org.nasdanika.common.Status.ERROR) {
					throw new org.nasdanika.common.DiagnosticException("Page diagnostic failed", diagnostic);
				}
			
				org.nasdanika.html.HTMLPage htmlPage = (HTMLPage) pageWork.splitAndExecute(pageMonitor);				
				htmlPage.body(new ViewGeneratorImpl(context, htmlPage::head, htmlPage::body).processViewPart(action, monitor.split("Generating action content", 1)));

				String path = context.interpolate(url);
				int hashIdx = path.indexOf("#");
				if (hashIdx != -1) {
					path = path.substring(0, hashIdx);
				}
				try (ProgressMonitor contentMonitor = pageMonitor.split("Writing content "+path, 1)) {
					contentContainer.put(path, htmlPage.toString(), contentMonitor);
				}
			}
		}
	}

}
