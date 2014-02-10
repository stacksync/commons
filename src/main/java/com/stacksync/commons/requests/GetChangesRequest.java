package com.stacksync.commons.requests;

import java.io.Serializable;

public class GetChangesRequest extends Request implements Serializable {
	
	protected static final long serialVersionUID = 813854865352783750L;

	protected Long workspaceId;
	
	public GetChangesRequest(String userId, Long workspaceId) {
		super(userId);
		this.workspaceId = workspaceId;
	}

	public Long getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(Long workspaceId) {
		this.workspaceId = workspaceId;
	}

}
