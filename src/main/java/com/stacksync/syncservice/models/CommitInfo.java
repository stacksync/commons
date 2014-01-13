package com.stacksync.syncservice.models;

import java.io.Serializable;


public class CommitInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long fileId;
	private String rootId;
	private long version;
	private boolean committed;
	private ObjectMetadata metadata;

	public CommitInfo(long fileId, String rootId, long version, boolean committed,
			ObjectMetadata metadata) {

		this.fileId = fileId;
		this.rootId = rootId;
		this.version = version;
		this.committed = committed;
		this.metadata = metadata;

	}

	public long getFileId() {
		return fileId;
	}

	public void setFileId(long fileId) {
		this.fileId = fileId;
	}

	public String getRootId() {
		return rootId;
	}

	public void setRootId(String rootId) {
		this.rootId = rootId;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public boolean isCommitted() {
		return committed;
	}

	public void setCommitted(boolean committed) {
		this.committed = committed;
	}

	public ObjectMetadata getMetadata() {
		return metadata;
	}

	public void setMetadata(ObjectMetadata metadata) {
		this.metadata = metadata;
	}

}
