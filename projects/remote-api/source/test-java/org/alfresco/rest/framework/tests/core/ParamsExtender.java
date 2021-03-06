package org.alfresco.rest.framework.tests.core;

import static org.mockito.Mockito.mock;

import java.io.InputStream;
import java.util.Map;

import org.alfresco.rest.framework.jacksonextensions.BeanPropertiesFilter;
import org.alfresco.rest.framework.resource.parameters.Paging;
import org.alfresco.rest.framework.resource.parameters.Params;
import org.springframework.extensions.webscripts.WebScriptRequest;

/**
 * Just extends the Params class for testing purposes
 *
 * @author Gethin James
 */
public class ParamsExtender extends Params
{

    private ParamsExtender(String entityId, String relationshipId, Object passedIn, InputStream stream, String addressedProperty, RecognizedParams recognizedParams)
    {
        super(entityId, relationshipId, passedIn, stream, addressedProperty, recognizedParams, null, mock(WebScriptRequest.class));
    }
    
    public static Params valueOf(Map<String, BeanPropertiesFilter> rFilter, String entityId)
    {
        return new ParamsExtender(entityId, null, null, null, null, new Params.RecognizedParams(null, null, null, rFilter, null, null, null, null, false));
    }

    public static Params valueOf(boolean includeSource, String entityId)
    {
        return new ParamsExtender(entityId, null, null, null, null, new Params.RecognizedParams(null, null, null, null, null, null, null, null, includeSource));
    }

    public static Params valueOf(Paging paging, String entityId)
    {
        return new ParamsExtender(entityId, null, null, null, null, new Params.RecognizedParams(null, paging, null, null, null, null, null, null, false));
    }

    public static Params valueOf(Map<String, String[]> params)
    {
        return new ParamsExtender(null, null, null, null, null, new Params.RecognizedParams(params, null, null, null, null, null, null, null, false));
    }

}
