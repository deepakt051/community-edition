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
package org.alfresco.service.cmr.invitation;

import java.util.Date;


/**
 * The nominated invitation is a model object for who, needs to be added or removed 
 * from which resource with which attributes.
 * 
 * Invitations are processed by the InvitationService
 * 
 * @see org.alfresco.service.cmr.invitation.InvitationService
 *
 * @author mrogers
 */
public interface NominatedInvitation extends Invitation
{
	public String getInviteeUserName();

	public String getInviteeFirstName();

	public String getInviteeLastName();

	public String getInviteeEmail();

	public String getResourceName();

    public String getResourceTitle();

    public String getResourceDescription();

	public String getServerPath();

	public String getAcceptUrl();

	public String getRejectUrl();

	public Date getSentInviteDate();
	
	public String getInviterUserName();

	public String getTicket();
	
	public String getRoleName();
}
