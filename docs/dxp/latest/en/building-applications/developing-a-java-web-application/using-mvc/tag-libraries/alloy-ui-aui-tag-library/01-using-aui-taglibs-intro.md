# Using AUI Taglibs

The AUI tag library provides tags that implement commonly used UI components.  These tags make your markup consistent, responsive, and accessible. 

You can find a list of the available `<aui>` taglibs in the  [AUI taglibdocs](https://docs.liferay.com/portal/7.2-latest/taglibs/util-taglib/aui/tld-summary.html).  Each taglib has a list of attributes that can be passed to the tag. Some of  these are required, and some are optional. See the taglibdocs to view the  requirements for each tag. You'll find the full markup generated by the tags in  their JSPs in their  [Liferay Github Repo](https://github.com/liferay/liferay-portal/tree/7.2.x/portal-web/docroot/html/taglib/aui)  folders.

To use the AUI taglib library in your apps, you must add the following  declaration to your JSP:

```markup
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
```

The AUI taglib is also available via a macro for your FreeMarker theme templates  and web content templates. Follow this syntax:

```markup
<@liferay_aui["tag-name"] attribute="string value" attribute=10 />
```

This section covers how to create UI components with the AUI taglibs. Each  article contains code examples along with a screenshot of the resulting UI. 