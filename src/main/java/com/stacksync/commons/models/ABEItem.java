/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stacksync.commons.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javigd
 */
public class ABEItem extends Item {
    
        private List<ABEMetaComponent> abeComponents;
        private String cipherSymKey;

	public ABEItem() {
		super(null);
                this.abeComponents = new ArrayList<ABEMetaComponent>();
	}

	public ABEItem(Long id) {
		super(id, null, null, null, null, null, null, null, null);
                this.abeComponents = new ArrayList<ABEMetaComponent>();
	}
        
        public ABEItem(Item item) {
            this(item.getId(), item.getWorkspace(), item.getLatestVersion(), item.getParent(), 
                    null, item.getFilename(), item.getMimetype(), item.isFolder(), 
                    item.getClientParentFileVersion(), null, null);
        }

	public ABEItem(Long id, Workspace workspace, Long latestVersion, Item parent, Long clientFileId,
			String filename, String mimetype, Boolean isFolder,
			Long clientParentFileVersion, List<ABEMetaComponent> abeComponents, String cipherSymKey) {
            
		super(id, workspace, latestVersion, parent, clientFileId, filename, mimetype, isFolder, clientParentFileVersion);
                this.abeComponents = abeComponents;
                this.cipherSymKey = cipherSymKey;
	}

        public List<ABEMetaComponent> getAbeComponents() {
                return abeComponents;
        }

        public void setAbeComponents(List<ABEMetaComponent> abeComponents) {
                this.abeComponents = abeComponents;
        }

        public String getCipherSymKey() {
                return cipherSymKey;
        }

        public void setCipherSymKey(String cipherSymKey) {
                this.cipherSymKey = cipherSymKey;
        }

}
