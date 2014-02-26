package com.stacksync.commons.notifications;

import java.io.Serializable;
import java.util.UUID;

public class ShareProposalNotification extends Notification implements Serializable {

	protected static final long serialVersionUID = -3210149693220010223L;

	protected UUID workspaceId;
	protected String folderName;
	protected Long parentItemId;
	protected UUID ownerId;
	protected String ownerName;
	protected String swiftContainer;
	protected String swiftURL;

	public ShareProposalNotification(UUID workspaceId, String folderName, Long parentItemId, UUID ownerId,
			String ownerName, String swiftContainer) {
		super();
		this.workspaceId = workspaceId;
		this.folderName = folderName;
		this.parentItemId = parentItemId;
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.swiftContainer = swiftContainer;
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

	public UUID getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(UUID ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
