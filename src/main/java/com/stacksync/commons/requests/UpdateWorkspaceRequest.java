package com.stacksync.commons.requests;

import java.io.Serializable;

public class UpdateWorkspaceRequest extends Request implements Serializable{

	protected static final long serialVersionUID = -1295960595014495726L;

	protected Long workspaceId;
	protected String workspaceName;
	protected Long parentItemId;

	public UpdateWorkspaceRequest(String userId, Long workspaceId, String workspaceName, Long parentItemId) {
		super(userId);
		
		this.workspaceId = workspaceId;
		this.workspaceName = workspaceName;
		this.parentItemId = parentItemId;
	}

	public Long getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(Long workspaceId) {
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
