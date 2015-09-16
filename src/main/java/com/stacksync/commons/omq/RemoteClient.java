package com.stacksync.commons.omq;

import com.stacksync.commons.notifications.RevokeNotification;
import com.stacksync.commons.notifications.ShareProposalNotification;
import com.stacksync.commons.notifications.UpdateWorkspaceNotification;

import omq.Remote;
import omq.client.annotation.AsyncMethod;
import omq.client.annotation.MultiMethod;
import omq.client.annotation.RemoteInterface;

@RemoteInterface
public interface RemoteClient extends Remote {

	@MultiMethod
	@AsyncMethod
	void notifyShareProposal(ShareProposalNotification notification);
	
	@MultiMethod
	@AsyncMethod
	void notifyUpdateWorkspace(UpdateWorkspaceNotification notification);
        
        @MultiMethod
	@AsyncMethod
	void notifyRevokation(RevokeNotification notification);
}
