package com.stacksync.commons.requests;

import java.io.Serializable;
import java.util.UUID;

public class GetChangesRequest extends Request implements Serializable {
	
	protected static final long serialVersionUID = 813854865352783750L;

	protected UUID workspaceId;
	
	public GetChangesRequest(UUID userId, UUID workspaceId) {
		super(userId);
		this.workspaceId = workspaceId;
	}

	public UUID getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(UUID workspaceId) {
		this.workspaceId = workspaceId;
	}

}
