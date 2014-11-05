package com.stacksync.commons.models;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author javigd
 */
public class ABEItemMetadata extends ItemMetadata {

    private List<ABEMetaComponent> abeComponents;
    private String cipherSymKey;
    
    public ABEItemMetadata() {
        super();
    }

    public ABEItemMetadata(List<ABEMetaComponent> abeComponents, String cipherSymKey,
            Long id, Long version, UUID deviceId, Long parentId, Long parentVersion, 
            String status, Date modifiedAt, Long checksum, Long size, boolean isFolder,
            String filename, String mimetype, List<String> chunks) {
        
        super(id, version, deviceId, parentId, parentVersion, status, modifiedAt,
                checksum, size, isFolder, filename, mimetype, chunks);
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
