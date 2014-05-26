package com.stacksync.commons.models;

import java.io.Serializable;


public class CommitInfo implements Serializable {

	private static final long serialVersionUID = -1205107021066864318L;
	private Long committedVersion;
	private boolean commitSucceed;
	private ItemMetadata metadata;

	public CommitInfo(Long committedVersion, boolean commitSucceed,
			ItemMetadata metadata) {

		this.committedVersion = committedVersion;
		this.commitSucceed = commitSucceed;
		this.metadata = metadata;

	}

	public long getCommittedVersion() {
		return committedVersion;
	}

	public void setCommittedVersion(Long committedVersion) {
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
