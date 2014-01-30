package com.stacksync.commons.models;

import java.io.Serializable;
import java.util.List;


public class CommitResult implements Serializable {


	private static final long serialVersionUID = -6718869783377947343L;

	private String requestID;
	private List<CommitInfo> items;

	public CommitResult(String requestID, List<CommitInfo> objects) {
		this.requestID = requestID;
		this.items = objects;
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestId(String requestID) {
		this.requestID = requestID;
	}

	public List<CommitInfo> getObjects() {
		return items;
	}

	public void setObjects(List<CommitInfo> objects) {
		this.items = objects;
	}

}
