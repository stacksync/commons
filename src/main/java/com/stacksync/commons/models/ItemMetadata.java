package com.stacksync.commons.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class ItemMetadata extends SyncMetadata {

	private static final long serialVersionUID = -2494445120408291949L;

	protected String status;
	protected Date modifiedAt;
	protected Long checksum;
	protected Long size;
	protected String filename;
	protected String mimetype;

	protected Integer level; // for API calls
	protected Boolean isRoot; // for API calls
	protected List<ItemMetadata> children;

	public ItemMetadata() {
                super();
		this.isRoot = false;
	}

	public ItemMetadata(Long id, Long version, UUID deviceId, Long parentId,
			Long parentVersion, String status, Date modifiedAt, Long checksum,
			Long size, boolean isFolder, String filename, String mimetype,
			List<String> chunks) {

                super(id, version, deviceId, parentId, parentVersion, isFolder, chunks);
            
		this.status = status;
		this.modifiedAt = modifiedAt;
		this.checksum = checksum;
		this.size = size;
		this.filename = filename;
		this.mimetype = mimetype;

		this.isRoot = false;
	}
        
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Long getChecksum() {
		return checksum;
	}

	public void setChecksum(Long checksum) {
		this.checksum = checksum;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
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

	public Boolean isRoot() {
		return isRoot;
	}

	public void setIsRoot(Boolean isRoot) {
		this.isRoot = isRoot;
	}

	public List<ItemMetadata> getChildren() {
		if (this.children == null)
			return new ArrayList<ItemMetadata>();

		return this.children;
	}

	public void setChildren(List<ItemMetadata> children) {
		this.children = children;
	}

	public void addChild(ItemMetadata itemMetadata) {
		if (this.children == null)
			this.children = new ArrayList<ItemMetadata>();
		this.children.add(itemMetadata);
	}

	public boolean equals(ItemMetadata metadata) {

		if (!metadata.getId().equals(this.id)
				|| !metadata.getDeviceId().equals(this.deviceId)
				|| !metadata.getChecksum().equals(this.checksum)
				|| !metadata.getSize().equals(this.size)) {
			return false;
		}

		if (!metadata.getStatus().equals(this.status)
				|| !metadata.getFilename().equals(this.filename)
				|| !metadata.getMimetype().equals(this.mimetype)) {
			return false;
		}

		if (!metadata.getVersion().equals(this.version)) {
			return false;
		}

		if (metadata.isFolder() != this.isFolder) {
			return false;
		}

		if (this.parentId != null && metadata.getParentId() != null) {
			if (!metadata.getParentId().equals(this.parentId)) {
				return false;
			}
		}

		if (this.parentVersion != null && metadata.getParentVersion() != null) {
			if (!metadata.getParentVersion().equals(this.parentVersion)) {
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

		return ((ItemMetadata) obj).id == this.id;
	}

	@Override
	public String toString() {

		String format = "ItemMetadata: {id=%s, filename=%s, chunks=%s, content=%s}";
		String result = String.format(format, id, filename, chunks.size(),
				(children == null) ? 0 : children.size());

		return result;
	}
}
