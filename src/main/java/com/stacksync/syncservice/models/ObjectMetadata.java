package com.stacksync.syncservice.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectMetadata implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String rootId;
	private Long fileId;
	private Long version;
	private String parentRootId;
	private Long parentFileId;
	private Long parentFileVersion;
	private Date serverDateModified; // Time stamp -> Date Java -> public
										// Date(Long date);
	private String status;
	private Date clientDateModified;
	private Long checksum;
	private String clientName;
	private List<String> chunks; // more optimal
	private Long fileSize;
	private Boolean isFolder;
	private String fileName;
	private String filePath;
	private String mimetype;

	private Integer level; // for API calls
	private Boolean isRoot; // for API calls
	private List<ObjectMetadata> content;

	public ObjectMetadata() {
		this.isRoot = false;
		this.chunks = new ArrayList<String>();
	}


	public ObjectMetadata(String rootId, Long fileId, Long version, String parentRootId, Long parentFileId,
			Long parentFileVersion, Date serverDateModified, String status, Date clientDateModified, Long checksum,
			String clientName, List<String> chunks, Long fileSize, boolean isFolder, String fileName, String filePath,
			String mimetype) {

		this.rootId = rootId;
		this.fileId = fileId;
		this.version = version;
		this.parentRootId = parentRootId;
		this.parentFileId = parentFileId;
		this.parentFileVersion = parentFileVersion;
		this.serverDateModified = serverDateModified;
		this.status = status;
		this.clientDateModified = clientDateModified;
		this.checksum = checksum;
		this.clientName = clientName;
		this.fileSize = fileSize;
		this.isFolder = isFolder;
		this.fileName = fileName;
		this.filePath = filePath;
		this.mimetype = mimetype;
		this.chunks = chunks;
		this.isRoot = false;

		if (chunks == null) {
			this.chunks = new ArrayList<String>();
		}
	}

	public String getRootId() {
		return rootId;
	}

	public void setRootId(String rootId) {
		this.rootId = rootId;
	}

	public Long getFileId() {
		return fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}

	public String getParentRootId() {
		return parentRootId;
	}

	public void setParentRootId(String parentRootId) {
		this.parentRootId = parentRootId;
	}

	public Long getParentFileId() {
		return parentFileId;
	}

	public Date getServerDateModified() {
		return serverDateModified;
	}

	public void setServerDateModified(Date serverDateModified) {
		this.serverDateModified = serverDateModified;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getClientDateModified() {
		return clientDateModified;
	}

	public void setClientDateModified(Date clientDateModified) {
		this.clientDateModified = clientDateModified;
	}

	public Long getChecksum() {
		return checksum;
	}

	public void setChecksum(Long checksum) {
		this.checksum = checksum;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getParentFileVersion() {
		return parentFileVersion;
	}

	public void setParentFileVersion(Long parentFileVersion) {
		this.parentFileVersion = parentFileVersion;
	}

	public List<String> getChunks() {
		return chunks;
	}

	public void setChunks(List<String> chunks) {
		this.chunks = chunks;
	}

	public boolean isFolder() {
		return isFolder;
	}

	public void setFolder(boolean isFolder) {
		this.isFolder = isFolder;
	}

	public void setParentFileId(Long parentFileId) {
		this.parentFileId = parentFileId;
	}

	public String getMimetype() {
		return mimetype;
	}

	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public void setIsRoot(Boolean isRoot) {
		this.isRoot = isRoot;
	}

	public Boolean isRoot() {
		return this.isRoot;
	}

	public List<ObjectMetadata> getContent() {
		if (this.content == null)
			return new ArrayList<ObjectMetadata>();

		return this.content;
	}

	public void setContent(List<ObjectMetadata> content) {
		this.content = content;
	}

	public void addObjectMetadata(ObjectMetadata objectMetadata) {
		if (this.content == null)
			this.content = new ArrayList<ObjectMetadata>();
		this.content.add(objectMetadata);
	}


	public boolean equals(ObjectMetadata metadata) {

		if (!metadata.getFileId().equals(this.fileId) || !metadata.getChecksum().equals(this.checksum)
				|| !metadata.getFileSize().equals(this.fileSize)) {
			return false;
		}

		if (!metadata.getRootId().equals(this.rootId) || !metadata.getStatus().equals(this.status)
				|| !metadata.getClientName().equals(this.clientName) || !metadata.getFileName().equals(this.fileName)
				|| !metadata.getFilePath().equals(this.filePath) || !metadata.getMimetype().equals(this.mimetype)) {
			return false;
		}

		if (!metadata.getVersion().equals(this.version)) {
			return false;
		}

		if (metadata.isFolder() != this.isFolder) {
			return false;
		}

		if (this.parentRootId != null && metadata.getParentRootId() != null) {
			if (!metadata.getParentRootId().equals(this.parentRootId)) {
				return false;
			}
		}

		if (this.parentFileId != null && metadata.getParentFileId() != null) {
			if (!metadata.getParentFileId().equals(this.parentFileId)) {
				return false;
			}
		}

		if (this.parentFileVersion != null && metadata.getParentFileVersion() != null) {
			if (!metadata.getParentFileVersion().equals(this.parentFileVersion)) {
				return false;
			}
		}

		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (obj.getClass() != getClass())
			return false;

		return ((ObjectMetadata) obj).fileId == this.fileId;
	}

	@Override
	public String toString() {

		String format = "ObjectMetadata: {fileId=%s, fileName=%s, chunks=%s, content=%s}";
		String result = String.format(format, fileId, fileName, chunks.size(), (content == null) ? 0 : content.size());

		return result;
	}
}
