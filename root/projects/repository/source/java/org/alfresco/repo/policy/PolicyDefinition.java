/*
 * Copyright (C) 2005-2010 Alfresco Software Limited.
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
package org.alfresco.repo.policy;

import org.alfresco.repo.policy.Policy.Arg;
import org.alfresco.service.namespace.QName;


/**
 * Definition of a Policy
 * 
 * @author David Caruana
 *
 * @param <P>  the policy interface
 */
public interface PolicyDefinition<P extends Policy>
{
    /**
     * Gets the name of the Policy
     * 
     * @return  policy name
     */
    public QName getName();
    
    
    /**
     * Gets the Policy interface class
     * 
     * @return  the class
     */
    public Class<P> getPolicyInterface();

    
    /**
     * Gets the Policy type
     * 
     * @return  the policy type
     */
    public PolicyType getType();
    
    /**
     * Gets Policy Argument definition for the specified argument index
     * 
     * @param index  argument index
     * @return  ARG.KEY or ARG.START_VALUE or ARG.END_VALUE
     */
    public Arg getArgument(int index);

    /**
     * Gets Policy Argument definitions for all arguments in order of arguments
     * @return
     */
    public Arg[] getArguments();
    
}
