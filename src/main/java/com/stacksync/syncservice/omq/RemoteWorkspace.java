package com.stacksync.syncservice.omq;


import com.stacksync.syncservice.models.CommitResult;

import omq.Remote;
import omq.client.annotation.AsyncMethod;
import omq.client.annotation.MultiMethod;
import omq.client.annotation.RemoteInterface;

/**
 * 
 * @author Sergi Toda <sergi.toda@estudiants.urv.cat>
 * 
 */
@RemoteInterface
public interface RemoteWorkspace extends Remote {

	@MultiMethod
	@AsyncMethod
	void notifyCommit(CommitResult commitResult);
}
