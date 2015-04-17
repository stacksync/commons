package com.stacksync.commons.models;

import java.io.Serializable;


public class ExternalFolderMetadata implements Serializable{

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getOauthTokenKey() {
		return oauthTokenKey;
	}

	public void setOauthTokenKey(String oauthTokenKey) {
		this.oauthTokenKey = oauthTokenKey;
	}

	public String getOauthTokenSecret() {
		return oauthTokenSecret;
	}

	public void setOauthTokenSecret(String oauthTokenSecret) {
		this.oauthTokenSecret = oauthTokenSecret;
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1882854156402007456L;
	
	private String url;
	private String oauthTokenKey;
	private String oauthTokenSecret;
	private String folderName;

	public ExternalFolderMetadata() {
	}

	public ExternalFolderMetadata(String url, String oauthTokenKey, String oauthTokenSecret, String folderName) {
		this.url = url;
		this.oauthTokenKey = oauthTokenKey;
		this.oauthTokenSecret = oauthTokenSecret;
		this.folderName = folderName;
	}


	//TODO: Implement toString method
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}

