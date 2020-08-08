package org.nasdanika.vinci.cli;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.cli.ContextBuilder;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;

/**
 * Resolves {@link EPackage} alias/{@link EClassifier} name to links to Ecore model documentation. E.g. ncore/Array to https://www.nasdanika.org/builds/master/doc/reference/model-doc/75726e3a6f72672e6e617364616e696b612e6e636f7265/Array.html
 *  
 * @author Pavel
 *
 */
public class EcoreDocContextBuilder implements ContextBuilder {

	@SuppressWarnings("unchecked")
	@Override
	public Context build(Object config, Context context, ProgressMonitor progressMonitor) {		
		// alias -> Base URL/hex encoded NS URI.
		Map<String,String> aliases = new HashMap<>();		
		for (Entry<String, Map<String, String>> ce: ((Map<String,Map<String,String>>) config).entrySet()) {
			String normalizedBase = context.interpolateToString(ce.getValue().get("base"));
			if (!normalizedBase.endsWith("/")) {
				normalizedBase += "/";
			}
			String encodedNsURI = Hex.encodeHexString(ce.getValue().get("ns-uri").getBytes(StandardCharsets.UTF_8));
			aliases.put(ce.getKey(), normalizedBase + encodedNsURI + "/");
		}
		
		return new Context() {
			
			private String link(String href, String text, String defaultText) {
				return new StringBuilder("<a href='")
						.append(href)
						.append("'>")
						.append(text == null ? defaultText : text)
						.append("</a>").toString();				
			}
			
			@Override
			public Object get(String key) {
				// alias - package-summary.html
				// alias/classifier[separator fragment]
				// # for everything
				// . for attributes
				// : for references
				
				int spaceIdx = key.indexOf(' ');
				String spec = spaceIdx == -1 ? key : key.substring(0, spaceIdx);
				String text = spaceIdx == -1 ? null : key.substring(spaceIdx + 1);
				
				URI contextURI = context.get(URI.class);
				
				int slashIdx = spec.indexOf('/');
				if (slashIdx == -1) {
					String pkgURL = aliases.get(spec);
					if (pkgURL == null) {
						return null;
					}
					if (contextURI != null) {
						pkgURL = URI.createURI(pkgURL).resolve(contextURI).toString();
					}				
					return link(pkgURL + "package-summary.html", text, spec);
				}
				
				String alias = spec.substring(0, slashIdx);
				String pkgURL = aliases.get(alias);
				if (pkgURL == null) {
					return null;
				}
				if (contextURI != null) {
					pkgURL = URI.createURI(pkgURL).resolve(contextURI).toString();
				}				
				
				int dotIdx = spec.indexOf('.', slashIdx);
				if (dotIdx != -1) {
					// EAttribute
					return link(
							pkgURL + spec.substring(slashIdx + 1, dotIdx) + "#EAttribute-" + spec.substring(dotIdx + 1), 
							text, 
							spec.substring(slashIdx + 1));
				}				
				int colonIdx = spec.indexOf(':', slashIdx);
				if (colonIdx != -1) {
					// EReference
					return link(
							pkgURL + spec.substring(slashIdx + 1, colonIdx) + "#EReference-" + spec.substring(colonIdx + 1), 
							text, 
							spec.substring(slashIdx + 1, colonIdx) + "." + spec.substring(colonIdx + 1));
				}
				// No fragment or any fragment. 
				return link(pkgURL + spec.substring(slashIdx + 1), text, spec.substring(slashIdx + 1));
			}

			@Override
			public <T> T get(Class<T> type) {
				return null;
			}
			
		};
	}

}
