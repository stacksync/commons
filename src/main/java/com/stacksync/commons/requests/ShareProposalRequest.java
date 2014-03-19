package com.stacksync.commons.requests;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class ShareProposalRequest extends Request implements Serializable {

	protected static final long serialVersionUID = -5985754297818659222L;

	protected List<String> emails;
	protected String folderName;
	protected boolean isEncrypted;

	public ShareProposalRequest(UUID userId, List<String> emails,
			String folderName, boolean isEncrypted) {
		super(userId);
		
		this.emails = emails;
		this.folderName = folderName;
		this.isEncrypted = isEncrypted;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public boolean isEncrypted() {
		return isEncrypted;
	}

	public void setEncrypted(boolean isEncrypted) {
		this.isEncrypted = isEncrypted;
	}
	
	

}
