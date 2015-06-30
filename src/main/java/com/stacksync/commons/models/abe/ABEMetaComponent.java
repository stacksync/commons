package com.stacksync.commons.models.abe;

import java.io.Serializable;

/**
 *
 * @author javigd
 */
public class ABEMetaComponent implements Serializable {
    
    private Long id;
    private String attributeId;
    private byte[] encryptedPKComponent;
    private Long version;

    public ABEMetaComponent() {
        this.id = null;
    }
    
    public ABEMetaComponent(Long id, String attribute, byte[] encryptedPKComponent, Long version) {
        this.id = id;
        this.attributeId = attribute;
        this.encryptedPKComponent = encryptedPKComponent;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }

    public byte[] getEncryptedPKComponent() {
        return encryptedPKComponent;
    }

    public void setEncryptedPKComponent(byte[] encryptedPKComponent) {
        this.encryptedPKComponent = encryptedPKComponent;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
    
    public boolean isValid() {
        boolean valid = true;
        if (this.attributeId == null || this.encryptedPKComponent == null || this.version == null) {
            valid = false;
        }
        return valid;
    }
    
	@Override
	public String toString() {

		String format = "ItemMetadata: {id=%s, attribute=%s, pk component=%s}";
		String result = String.format(format, id, attributeId, encryptedPKComponent);

		return result;
	}
}
