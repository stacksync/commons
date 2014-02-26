package com.stacksync.commons.requests;

import java.io.Serializable;

public class UpdateWorkspaceRequest extends Request implements Serializable{

	protected static final long serialVersionUID = -1295960595014495726L;

	protected String workspaceId;
	protected String workspaceName;
	protected Long parentItemId;

	public UpdateWorkspaceRequest(String userId, String workspaceId, String workspaceName, Long parentItemId) {
		super(userId);
		
		this.workspaceId = workspaceId;
		this.workspaceName = workspaceName;
		this.parentItemId = parentItemId;
	}

	public String getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
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
