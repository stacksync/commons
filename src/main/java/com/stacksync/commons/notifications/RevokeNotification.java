package com.stacksync.commons.notifications;

import java.io.Serializable;
import java.util.UUID;

public class RevokeNotification extends Notification implements Serializable {

	protected static final long serialVersionUID = -3210149693220010223L;

	protected UUID workspaceId;
        protected byte[] secretKey;
        protected byte[] publicKey;

	public RevokeNotification(UUID workspaceId, byte[] pubKey, byte[] secretKey) {
		super();
		this.workspaceId = workspaceId;
                this.publicKey = pubKey;
                this.secretKey = secretKey;
	}

	public UUID getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(UUID workspaceId) {
		this.workspaceId = workspaceId;
	}
        
        public byte[] getPublicKey() {
            return publicKey;
        }

        public void setPublicKey(byte[] publicKey) {
            this.publicKey = publicKey;
        }

        public byte[] getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(byte[] secretKey) {
            this.secretKey = secretKey;
        }
        
        

}
