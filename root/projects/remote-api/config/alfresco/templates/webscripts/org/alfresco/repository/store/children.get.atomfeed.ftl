<#import "/org/alfresco/paging.lib.atom.ftl" as pagingLib/>
<#import "/org/alfresco/cmis/entries.lib.atom.ftl" as entriesLib/>
<?xml version="1.0" encoding="UTF-8"?>
<feed xmlns="http://www.w3.org/2005/Atom" xmlns:cmis="http://www.cmis.org/CMIS/1.0" xmlns:alf="http://www.alfresco.org" xmlns:opensearch="http://a9.com/-/spec/opensearch/1.1/">
  <generator version="${server.version}">Alfresco (${server.edition})</generator>
  <title>${node.name}</title> 
  <updated>${xmldate(node.properties.modified)}</updated>
  <icon>${absurl(url.context)}/images/logo/AlfrescoLogo16.ico</icon>
  <author> 
    <name>${node.properties.creator!""}</name>
  </author> 
  <id>urn:uuid:${node.id}</id>
  <link rel="self" href="${absurl(url.full)?xml}" type="${format.type}"/>
  <@pagingLib.cursor cursor=cursor/>
<#list results as child>
<#if child.isDocument>  
  <@entriesLib.document node=child/>
<#else>
  <@entriesLib.folder node=child/>
</#if>
</#list>
</feed>