package com.stacksync.commons.notifications;

import java.io.Serializable;
import java.util.List;

import com.stacksync.commons.models.CommitInfo;

public class CommitNotification extends Notification implements Serializable {

	protected static final long serialVersionUID = -6718869783377947343L;

	protected List<CommitInfo> items;

	public CommitNotification(String requestId, List<CommitInfo> items) {
		super(requestId);
		this.items = items;
	}

	public List<CommitInfo> getObjects() {
		return items;
	}

	public void setObjects(List<CommitInfo> objects) {
		this.items = objects;
	}

}
