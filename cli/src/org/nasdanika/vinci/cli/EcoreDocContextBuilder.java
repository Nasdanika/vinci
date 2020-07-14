package org.nasdanika.vinci.cli;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.codec.binary.Hex;
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
			String normalizedBase = context.interpolate(ce.getValue().get("base"));
			if (!normalizedBase.endsWith("/")) {
				normalizedBase += "/";
			}
			String encodedNsURI = Hex.encodeHexString(ce.getValue().get("ns-uri").getBytes(StandardCharsets.UTF_8));
			aliases.put(ce.getKey(), normalizedBase + encodedNsURI + "/");
		}
		
		return new Context() {
			
			private String link(String href, String text) {
				return new StringBuilder("<a href='")
						.append(href)
						.append("'>")
						.append(text)
						.append("</a>").toString();				
			}
			
			@Override
			public Object get(String key) {
				// alias - package-summary.html
				// alias/classifier[separator fragment]
				// # for everything
				// . for attributes
				// : for references
				
				int slashIdx = key.indexOf('/');
				if (slashIdx == -1) {
					String pkgURL = aliases.get(key);
					if (pkgURL == null) {
						return null;
					}
					return link(pkgURL + "package-summary.html", key);
				}
				
				String alias = key.substring(0, slashIdx);
				String pkgURL = aliases.get(alias);
				if (pkgURL == null) {
					return null;
				}
				int dotIdx = key.indexOf('.', slashIdx);
				if (dotIdx != -1) {
					// EAttribute
					return link(pkgURL + key.substring(slashIdx + 1, dotIdx) + "#EAttribute-" + key.substring(dotIdx + 1), key.substring(slashIdx + 1));
				}				
				int colonIdx = key.indexOf(':', slashIdx);
				if (colonIdx != -1) {
					// EReference
					return link(pkgURL + key.substring(slashIdx + 1, colonIdx) + "#EReference-" + key.substring(colonIdx + 1), key.substring(slashIdx + 1, colonIdx) + "." + key.substring(colonIdx + 1));
				}
				// No fragment or any fragment. No way to specify alternative text yet.
				return link(pkgURL + key.substring(slashIdx + 1), key.substring(slashIdx + 1));
			}

			@Override
			public <T> T get(Class<T> type) {
				return null;
			}
			
		};
	}

}
