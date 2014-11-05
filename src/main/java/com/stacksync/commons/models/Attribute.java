package com.stacksync.commons.models;

import java.io.Serializable;

/**
 *
 * @author javigd
 */
public class Attribute implements Serializable {

    private Long id;
    private String name;
    private Long latestVersion;
    private String publicKeyComponent;

    public Attribute() {
        this.id = null;
    }
    
    public Attribute(Long id, String name, Long latestVersion, String publicKeyComponent) {
        this.id = id;
        this.name = name;
        this.latestVersion = latestVersion;
        this.publicKeyComponent = publicKeyComponent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(Long latestVersion) {
        this.latestVersion = latestVersion;
    }

    public String getPublicKeyComponent() {
        return publicKeyComponent;
    }

    public void setPublicKeyComponent(String publicKeyComponent) {
        this.publicKeyComponent = publicKeyComponent;
    }

    public boolean isValid() {
        boolean valid = true;
        if (this.name == null || this.latestVersion == null || this.publicKeyComponent == null) {
            valid = false;
        }
        return valid;
    }

}
