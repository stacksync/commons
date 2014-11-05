package com.stacksync.commons.models;

import java.io.Serializable;

/**
 *
 * @author javigd
 */
public class ABEMetaComponent implements Serializable {
    
    private Long id;
    private Attribute attribute;
    private String encryptedPKComponent;
    private Long version;

    public ABEMetaComponent() {
        this.id = null;
    }
    
    public ABEMetaComponent(Long id, Attribute attribute, String encryptedPKComponent, Long version) {
        this.id = id;
        this.attribute = attribute;
        this.encryptedPKComponent = encryptedPKComponent;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public String getEncryptedPKComponent() {
        return encryptedPKComponent;
    }

    public void setEncryptedPKComponent(String encryptedPKComponent) {
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
        if (this.attribute == null || this.encryptedPKComponent == null || this.version == null) {
            valid = false;
        }
        return valid;
    }
    
}
