package com.stacksync.commons.omq;


import com.stacksync.commons.models.CommitResult;

import omq.Remote;
import omq.client.annotation.AsyncMethod;
import omq.client.annotation.MultiMethod;
import omq.client.annotation.RemoteInterface;

@RemoteInterface
public interface RemoteWorkspace extends Remote {

	@MultiMethod
	@AsyncMethod
	void notifyCommit(CommitResult commitResult);
}
