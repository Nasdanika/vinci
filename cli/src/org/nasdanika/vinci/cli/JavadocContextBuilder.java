package org.nasdanika.vinci.cli;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.nasdanika.cli.ContextBuilder;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Status;
import org.nasdanika.common.Util;

/**
 * 
 * @author Pavel
 *
 */
public class JavadocContextBuilder implements ContextBuilder {
	
	private final String PACKAGE_SUMMARY_HTML = "package-summary.html";

	@SuppressWarnings("unchecked")
	@Override
	public Context build(Object config, Context context, ProgressMonitor progressMonitor) {		
		// package -> Base URL.
		Map<String,String> packageMap = new HashMap<>();		
		Collection<String> links = (Collection<String>) config;
		progressMonitor.setWorkRemaining(links.size());
		for (String link: links) {
			if (!Util.isBlank(link)) {
				String normalizedLocation = context.interpolate(link.trim());
				if (!normalizedLocation.endsWith("/")) {
					normalizedLocation += "/";
				}
				try {
					URL packageListURL = new URL(normalizedLocation+"package-list");
					try (BufferedReader br = new BufferedReader(new InputStreamReader(packageListURL.openStream()))) {
						String line;
						while ((line = br.readLine()) != null) {
							packageMap.put(line.trim(), normalizedLocation);
						}
						progressMonitor.worked(Status.SUCCESS, 1, "Loaded package list from " + link);
					} catch (Exception e) {
						progressMonitor.worked(Status.ERROR, 1, "Could not download package list from " + link + " - " + e);
					}
				} catch (MalformedURLException e) {
					progressMonitor.worked(Status.ERROR, 1, "Invalid JavaDoc URL: " + link + " - " + e);
				}
			}
		}
		
		return new Context() {
			
			private String getRef(String spec) {
				int hashIdx = spec.indexOf("#");
				if (hashIdx != -1) {
					spec = spec.substring(0, hashIdx);
				}
				for (Entry<String, String> location: packageMap.entrySet()) {
					String key = location.getKey();
					String value = location.getValue();
					if (key.equals(spec)) { // Package
						return value + "index.html?" + spec.replace('.', '/') + "/" + PACKAGE_SUMMARY_HTML;
					}
					
					int idx = spec.lastIndexOf('.');
					if (idx != -1 && spec.substring(0, idx).equals(key)) { // Class
						if (hashIdx == -1) {
							value += "index.html?";
						}
						return value + spec.replace('.', '/').replace('$', '.') + ".html";				
					}
				}
				return null;				
			}

			@Override
			public Object get(String key) {
				String href = getRef(key);
				if (href == null) {
					return key;
				}
				
				int hashIdx = key.indexOf("#");
				if (hashIdx != -1) {
					String fragment = key.substring(hashIdx+1);
					int firstParenthesisIdx = fragment.indexOf("(");
					if (firstParenthesisIdx > 0 && fragment.endsWith(")")) {
						// Convert (type[,type]) to -type-type-						
						StringBuilder fragmentBuilder = new StringBuilder(fragment.substring(0, firstParenthesisIdx)).append("-");
						String[] pTypes = fragment.substring(firstParenthesisIdx+1, fragment.length()-1).split(",");
						for (String pType: pTypes) {
							pType = pType.trim();
							int bIdx = pType.indexOf("[]");
							if (bIdx == -1) {
								fragmentBuilder.append(pType);
							} else {
								fragmentBuilder.append(pType.substring(0, bIdx));
								for (int bc = bIdx; bc < pType.length(); bc+=2) {
									fragmentBuilder.append(":A");
								}
							}
							fragmentBuilder.append("-");
						}
						fragment = fragmentBuilder.toString();
					} 
					href += "#" + fragment;
				}
				return new StringBuilder("<a href='")
						.append(href)
						.append("'>")
						.append(key.replace('#', '.'))
						.append("</a>").toString();
			}

			@Override
			public <T> T get(Class<T> type) {
				return null;
			}
			
		};
	}

}