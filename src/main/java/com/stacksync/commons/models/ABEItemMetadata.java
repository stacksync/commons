package com.stacksync.commons.models;

import java.util.ArrayList;
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
        this.abeComponents = new ArrayList<ABEMetaComponent>();
    }

    public ABEItemMetadata( Long id, Long version, UUID deviceId, Long parentId, 
            Long parentVersion, String status, Date modifiedAt, Long checksum, Long size, 
            boolean isFolder, String filename, String mimetype, List<String> chunks, 
            List<ABEMetaComponent> abeComponents, String cipherSymKey) {

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
    
    public void addAbeComponent(ABEMetaComponent abeMetaComponent) {
        this.abeComponents.add(abeMetaComponent);
    }
    
    public void removeAbeComponent(ABEMetaComponent abeMetaComponent) {
        this.abeComponents.remove(abeMetaComponent);
    }
    
    public String getCipherSymKey() {
        return cipherSymKey;
    }

    public void setCipherSymKey(String cipherSymKey) {
        this.cipherSymKey = cipherSymKey;
    }
    
	@Override
	public String toString() {

		String format = "ABEItemMetadata: {id=%s, filename=%s, cypher symmetric key=%s, abe components=%s}";
		String result = String.format(format, id, filename, cipherSymKey, abeComponents);

		return result;
	}

}
