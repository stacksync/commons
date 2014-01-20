package com.stacksync.syncservice.models;

import java.io.Serializable;


public class CommitInfo implements Serializable {

	private static final long serialVersionUID = -1205107021066864317L;
	private long committedVersion;
	private boolean commitSucceed;
	private ItemMetadata metadata;

	public CommitInfo(long committedVersion, boolean commitSucceed,
			ItemMetadata metadata) {

		this.committedVersion = committedVersion;
		this.commitSucceed = commitSucceed;
		this.metadata = metadata;

	}

	public long getCommittedVersion() {
		return committedVersion;
	}

	public void setCommittedVersion(long committedVersion) {
		this.committedVersion = committedVersion;
	}

	public boolean isCommitSucceed() {
		return commitSucceed;
	}

	public void setCommitSucceed(boolean commitSucceed) {
		this.commitSucceed = commitSucceed;
	}

	public ItemMetadata getMetadata() {
		return metadata;
	}

	public void setMetadata(ItemMetadata metadata) {
		this.metadata = metadata;
	}

}
