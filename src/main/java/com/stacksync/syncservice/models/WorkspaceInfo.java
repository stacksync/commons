package com.stacksync.syncservice.models;

import java.io.Serializable;

public class WorkspaceInfo implements Serializable {

	private transient static final long serialVersionUID = 1L;
	private String id;
	private Integer latestRevision;
	private String path;

	public String getIdentifier() {
		return id;
	}

	public Integer getLatestRevision() {
		return latestRevision;
	}

	public String getPath() {
		return path;
	}

	public WorkspaceInfo(String id, Integer latestRevision, String path) throws Exception {
		this.id = id;
		this.latestRevision = latestRevision;
		this.path = path;
	}

	@Override
	public String toString() {
		return "RemoteWorkspace[id=" + id + ", latestRevision=" + latestRevision + ", path=" + path + "]";
	}
}
