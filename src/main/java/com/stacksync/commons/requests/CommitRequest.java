package com.stacksync.commons.requests;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import com.stacksync.commons.models.ItemMetadata;

public class CommitRequest extends Request implements Serializable {

	protected static final long serialVersionUID = 3150919522585945457L;

	protected String workspaceId;
	protected UUID deviceId;
	protected List<ItemMetadata> items;
	
	public CommitRequest(String userId, String workspaceId, UUID deviceId, List<ItemMetadata> items) {
		super(userId);
		this.workspaceId = workspaceId;
		this.deviceId = deviceId;
		this.items = items;
	}

	public String getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
	}

	public UUID getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(UUID deviceId) {
		this.deviceId = deviceId;
	}

	public List<ItemMetadata> getItems() {
		return items;
	}

	public void setItems(List<ItemMetadata> items) {
		this.items = items;
	}

}
