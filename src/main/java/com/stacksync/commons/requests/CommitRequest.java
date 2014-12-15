package com.stacksync.commons.requests;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import com.stacksync.commons.models.SyncMetadata;

public class CommitRequest extends Request implements Serializable {

	protected static final long serialVersionUID = 3150919522585945457L;

	protected UUID workspaceId;
	protected UUID deviceId;
	protected List<SyncMetadata> items;
	
	public CommitRequest(UUID userId, UUID workspaceId, UUID deviceId, List<SyncMetadata> items) {
		super(userId);
		this.workspaceId = workspaceId;
		this.deviceId = deviceId;
		this.items = items;
	}

	public UUID getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(UUID workspaceId) {
		this.workspaceId = workspaceId;
	}

	public UUID getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(UUID deviceId) {
		this.deviceId = deviceId;
	}

	public List<SyncMetadata> getItems() {
		return items;
	}

	public void setItems(List<SyncMetadata> items) {
		this.items = items;
	}

}
