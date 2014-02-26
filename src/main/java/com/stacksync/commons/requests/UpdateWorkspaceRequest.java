package com.stacksync.commons.requests;

import java.io.Serializable;
import java.util.UUID;

public class UpdateWorkspaceRequest extends Request implements Serializable{

	protected static final long serialVersionUID = -1295960595014495726L;

	protected UUID workspaceId;
	protected String workspaceName;
	protected Long parentItemId;

	public UpdateWorkspaceRequest(UUID userId, UUID workspaceId, String workspaceName, Long parentItemId) {
		super(userId);
		
		this.workspaceId = workspaceId;
		this.workspaceName = workspaceName;
		this.parentItemId = parentItemId;
	}

	public UUID getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(UUID workspaceId) {
		this.workspaceId = workspaceId;
	}

	public String getWorkspaceName() {
		return workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
	}

	public Long getParentItemId() {
		return parentItemId;
	}

	public void setParentItemId(Long parentItemId) {
		this.parentItemId = parentItemId;
	}
}
