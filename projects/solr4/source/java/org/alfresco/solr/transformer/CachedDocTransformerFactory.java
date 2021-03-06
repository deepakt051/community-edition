/*
 * Copyright (C) 2005-2014 Alfresco Software Limited.
 *
 * This file is part of Alfresco
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */
package org.alfresco.solr.transformer;

import org.apache.solr.common.params.SolrParams;
import org.apache.solr.request.SolrQueryRequest;
import org.apache.solr.response.transform.DocTransformer;
import org.apache.solr.response.transform.TransformerFactory;

/**
 * @author Andy
 *
 */
public class CachedDocTransformerFactory extends TransformerFactory
{

    /* (non-Javadoc)
     * @see org.apache.solr.response.transform.TransformerFactory#create(java.lang.String, org.apache.solr.common.params.SolrParams, org.apache.solr.request.SolrQueryRequest)
     */
    @Override
    public DocTransformer create(String field, SolrParams params, SolrQueryRequest req)
    {
        return new CachedDocTransformer();
    }

}
