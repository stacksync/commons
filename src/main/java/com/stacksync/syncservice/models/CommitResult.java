package com.stacksync.syncservice.models;

import java.io.Serializable;
import java.util.List;


/**
 * 
 * @author Sergi Toda <sergi.toda@estudiants.urv.cat>
 * 
 */
public class CommitResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String requestID;
	private List<CommitInfo> objects;

	public CommitResult(String requestID, List<CommitInfo> objects) {
		this.requestID = requestID;
		this.objects = objects;
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public List<CommitInfo> getObjects() {
		return objects;
	}

	public void setObjects(List<CommitInfo> objects) {
		this.objects = objects;
	}

}
