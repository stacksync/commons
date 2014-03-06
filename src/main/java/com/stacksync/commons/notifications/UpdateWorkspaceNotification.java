package com.stacksync.commons.notifications;

import java.io.Serializable;
import java.util.UUID;

public class UpdateWorkspaceNotification extends Notification implements Serializable{

	private static final long serialVersionUID = -6386191004604910726L;

	protected UUID workspaceId;
	protected String folderName;
	protected Long parentItemId;
	
	public UpdateWorkspaceNotification(UUID workspaceId, String folderName, Long parentItemId) {
		super();
		this.workspaceId = workspaceId;
		this.folderName = folderName;
		this.parentItemId = parentItemId;
	}

	public UUID getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(UUID workspaceId) {
		this.workspaceId = workspaceId;
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public Long getParentItemId() {
		return parentItemId;
	}

	public void setParentItemId(Long parentItemId) {
		this.parentItemId = parentItemId;
	}
	
	
	
}
