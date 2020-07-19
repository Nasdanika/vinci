Javadoc context builder resolves fully qualified names of Java packages, classes, fields, and methods to links to Java API documentation.
Javadoc context builder allows to reference API documentation of Java packages, types, and type members by their fully quialified names instead of URL's.
It simplifies writing technical documentation and referencing of Javadoc API's from generated content such as [Ecore Model Documentation](${base-uri}reference/model-doc/index.html), e.g. the instance class of ${ecore-doc/vinci-app/ActionBase}. 

### Examples

In the below examples the Javadoc context builder is mounted under ``javadoc/`` prefix.

* Package:
    * ``${{{javadoc/org.nasdankia.common}}}`` is resolved to ${javadoc/org.nasdanika.common}.
    * ``${{{javadoc/org.nasdankia.common Nasdanika common classes}}}`` is resolved to ${javadoc/org.nasdanika.common Nasanika common classes}.
* Class:
    * ``${{{javadoc/org.nasdankia.common.Context}}}`` is resolved to ${javadoc/org.nasdanika.common.Context}.
    * ``${{{javadoc/org.nasdankia.common.Context Context}}}`` is resolved to ${javadoc/org.nasdanika.common.Context Context}.
    * ``${{{javadoc/org.nasdankia.no-such-package.MyClass}}}`` is not resolved and is replaced with ${javadoc/org.nasdanika.no-such-package.MyClass}. The Javadoc context builder has no knowledge about classes, only about packages. I.e. ``${{{javadoc/org.nasdankia.common.NoSuchClass}}}`` would be resolved to a broken link because the context builder knows that ``org.nasdanika.common`` package exists, but it doesn't know that ``NoSuchClass`` does not exist in the package. 
    * ``${{{javadoc/java.util.Map$Entry}}}`` is resolved to ${javadoc/java.util.Map$Entry}.    
* Field: ``${{{javadoc/org.nasdanika.common.Context#BASE_URI_PROPERTY}}}`` is resolved to ${javadoc/org.nasdanika.common.Context#BASE_URI_PROPERTY}
* Methods: 
    * ``${{{javadoc/org.nasdanika.common.Context#fork()}}}`` is resolved to ${javadoc/org.nasdanika.common.Context#fork()}
    * ``${{{javadoc/org.nasdanika.common.Context#get(java.lang.Class)}}}`` is resolved to ${javadoc/org.nasdanika.common.Context#get(java.lang.Class)}
 
Javadoc context builder is configured with a list of URL's of Java API documentation to use in class to URL resolution.

### Token specification

As any interpolation token the Javadoc token consists of a key and an optional default value ``${{{<key>[|<default value>]}}}``.
They key has the following structure: ``[<prefix>]<fully qualified name>[ <alternative text>]``, where:

* prefix - context mount prefix, e.g. ``javadoc/``
* Fully qualified name - [FQN](https://en.wikipedia.org/wiki/Fully_qualified_name) of a class or member:
    * For packages - fully qualified package name.
    * For classes - fully qualified name with dot separator for top-level classes and ``$`` separator for nested classes.
    * For fields - fully qualified class name, ``#``, field name.
    * For methods - fully qualified class name, ``#``, method name, ``(``, list of fully qualified names of the formal parameters comma separated, ``)``.
* Alternative text - any text after a space will be used as a link text. If not specified, then fully qualified name is used as text with ``$`` and ``#`` replaced by ``.`` (dot).

In the case of Javadoc context builder the default value is never used because the Javadoc context builder returns a plain text for FQN or alternative text if it can't resolve an FQN to a link.          
 
### Configuration

The context builder is configured with a list of URL's. The URL's are interpolated and then resolved against the context URI.

Example:

```yaml
mounts:
    javadoc/:
        id: org.nasdanika.vinci.cli/javadoc-context-builder
        config:
            # Third-party
            - https://docs.oracle.com/javase/8/docs/api/
            - https://download.eclipse.org/modeling/emf/emf/javadoc/2.9.0/
            - https://picocli.info/apidocs/

            # Core
            - ../core/bundles/org.nasdanika.cli/apidocs/
            - https://nasdanika.org/builds/${release}/products/core/bundles/org.nasdanika.common/apidocs/
```
