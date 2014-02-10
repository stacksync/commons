package com.stacksync.commons.requests;

import java.io.Serializable;
import java.util.List;

import com.stacksync.commons.models.ItemMetadata;

public class CommitRequest extends Request implements Serializable {

	protected static final long serialVersionUID = 3150919522585945457L;

	protected Long workspaceId;
	protected Long deviceId;
	protected List<ItemMetadata> items;
	
	public CommitRequest(String userId, Long workspaceId, Long deviceId, List<ItemMetadata> items) {
		super(userId);
		this.workspaceId = workspaceId;
		this.deviceId = deviceId;
		this.items = items;
	}

	public Long getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(Long workspaceId) {
		this.workspaceId = workspaceId;
	}

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public List<ItemMetadata> getItems() {
		return items;
	}

	public void setItems(List<ItemMetadata> items) {
		this.items = items;
	}

}
