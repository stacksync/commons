package com.stacksync.commons.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class SharingProposal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1582857936402001556L;
	
	private Integer id;
	private UUID key;
	private Boolean isLocal;
	private Integer service;
	private String resourceUrl;
	private UUID owner;
	private Long folder;
	private Boolean writeAccess;
	private String recipient;
	private String callback;
	private String protocolVersion;
	private String status;
	private Date createdAt;
	private Date updatedAt;

	public SharingProposal() {
		this(null);
	}

	public SharingProposal(Integer id) {
		this(id, null, null, null, null, null, null, null, null, null, null, null, null, null);
	}

	public SharingProposal(Integer id, UUID key, Boolean isLocal, Integer service, String resourceUrl, UUID owner,
			Long folder, Boolean writeAccess, String recipient, String callback, String protocolVersion, String status, Date createdAt, Date updatedAt) {
		this.id = id;
		this.key = key;
		this.isLocal = isLocal;
		this.service = service;
		this.resourceUrl = resourceUrl;
		this.owner = owner;
		this.folder = folder;
		this.writeAccess = writeAccess;
		this.recipient = recipient;
		this.callback = callback;
		this.protocolVersion = protocolVersion;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UUID getKey() {
		return key;
	}

	public void setKey(UUID key) {
		this.key = key;
	}

	public Boolean getIsLocal() {
		return isLocal;
	}

	public void setIsLocal(Boolean isLocal) {
		this.isLocal = isLocal;
	}

	public Integer getService() {
		return service;
	}

	public void setService(Integer service) {
		this.service = service;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public UUID getOwner() {
		return owner;
	}

	public void setOwner(UUID owner) {
		this.owner = owner;
	}

	public Long getFolder() {
		return folder;
	}

	public void setFolder(Long folder) {
		this.folder = folder;
	}

	public Boolean getWriteAccess() {
		return writeAccess;
	}

	public void setWriteAccess(Boolean writeAccess) {
		this.writeAccess = writeAccess;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String getProtocolVersion() {
		return protocolVersion;
	}

	public void setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedsAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public boolean isValid(){
		//TODO: Implement this method
		return true;
	}
	//TODO: Implement toString method
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
