package com.stacksync.commons.notifications;

import java.io.Serializable;

public class ShareProposalNotification extends Notification implements Serializable {

	protected static final long serialVersionUID = -3210149693220010223L;

	protected String workspaceId;
	protected String folderName;
	protected Long parentItemId;
	protected String ownerId;
	protected String ownerName;
	protected String swiftContainer;
	protected String swiftURL;

	public ShareProposalNotification(String workspaceId, String folderName, Long parentItemId, String ownerId,
			String ownerName, String swiftContainer, String swiftURL) {
		super();
		this.workspaceId = workspaceId;
		this.folderName = folderName;
		this.parentItemId = parentItemId;
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.swiftContainer = swiftContainer;
		this.swiftURL = swiftURL;
	}

	public String getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
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

	public String getSwiftContainer() {
		return swiftContainer;
	}

	public void setSwiftContainer(String swiftContainer) {
		this.swiftContainer = swiftContainer;
	}

	public String getSwiftURL() {
		return swiftURL;
	}

	public void setSwiftURL(String swiftURL) {
		this.swiftURL = swiftURL;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
