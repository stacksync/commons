package com.stacksync.commons.requests;

import java.io.Serializable;
import java.util.List;

public class ShareProposalRequest extends Request implements Serializable {

	protected static final long serialVersionUID = -5985754297818659222L;

	protected List<String> emails;
	protected String folderName;

	public ShareProposalRequest(String userId, List<String> emails,
			String folderName) {
		super(userId);
		
		this.emails = emails;
		this.folderName = folderName;
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

}
