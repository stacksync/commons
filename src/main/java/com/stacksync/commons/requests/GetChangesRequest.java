package com.stacksync.commons.requests;

import java.io.Serializable;

public class GetChangesRequest extends Request implements Serializable {
	
	protected static final long serialVersionUID = 813854865352783750L;

	protected String workspaceId;
	
	public GetChangesRequest(String userId, String workspaceId) {
		super(userId);
		this.workspaceId = workspaceId;
	}

	public String getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
	}

}
