/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stacksync.commons.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author javigd
 */
public abstract class SyncMetadata implements Serializable {
    
	private static final long serialVersionUID = -2494445120408291949L;

	protected Long id;
	protected Long tempId;
	protected Long version;
	protected UUID deviceId;
	protected UUID workspaceId;
	protected Long parentId;
	protected Long parentVersion;
        
	protected List<String> chunks;
	protected Boolean isFolder;

        public SyncMetadata () {
                this.id = null;
                this.chunks = new ArrayList<String>();
        }
        
        public SyncMetadata (Long id, Long version, UUID deviceId, Long parentId,
			Long parentVersion, boolean isFolder, List<String> chunks) {
            
                this.id = id;
		this.version = version;
		this.deviceId = deviceId;
		this.parentId = parentId;
		this.parentVersion = parentVersion;
		this.isFolder = isFolder;
             
		if (chunks == null) {
			this.chunks = new ArrayList<String>();
		}
        }
        
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTempId() {
		return tempId;
	}

	public void setTempId(Long tempId) {
		this.tempId = tempId;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public UUID getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(UUID deviceId) {
		this.deviceId = deviceId;
	}
	
	public UUID getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(UUID workspaceId) {
		this.workspaceId = workspaceId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getParentVersion() {
		return parentVersion;
	}

	public void setParentVersion(Long parentVersion) {
		this.parentVersion = parentVersion;
	}
        
	public List<String> getChunks() {
		return chunks;
	}

	public void setChunks(List<String> chunks) {
		this.chunks = chunks;
	}
        
	public Boolean isFolder() {
		return isFolder;
	}

	public void setIsFolder(Boolean isFolder) {
		this.isFolder = isFolder;
	}
}
