package com.stacksync.commons.requests;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class ShareProposalRequest extends Request implements Serializable {

	protected static final long serialVersionUID = -5985754297818659222L;

	protected List<String> emails;
	protected String folderName;
	protected String swiftContainer;
	protected String swiftURL;

	public ShareProposalRequest(UUID userId, List<String> emails,
			String folderName, String swiftContainer, String swiftURL) {
		super(userId);
		
		this.emails = emails;
		this.folderName = folderName;
		this.swiftContainer = swiftContainer;
		this.swiftURL = swiftURL;
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

	public String getSwiftContainer() {
		return swiftContainer;
	}

	public void setSwiftContainer(String swiftContainer) {
		this.swiftContainer = swiftContainer;
	}

	public String getSwiftURL() {
		return swiftURL;
	}

	public void setSwiftURL(String swiftURL) {
		this.swiftURL = swiftURL;
	}

}
