package com.stacksync.commons.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

public class ABEWorkspace extends Workspace implements Serializable {

        private byte [] secretKey;
        private byte[] publicKey;
        private byte[] access_struct;

        public ABEWorkspace() {
                this((UUID)null);
        }

        public ABEWorkspace(UUID id) {
                this(id, 0, null, null, null, null);
        }

        public ABEWorkspace(Workspace workspace) {
            super(workspace.getId(), workspace.getName(), workspace.getParentItem(), workspace.getLatestRevision(), workspace.getOwner(), true, false, 
                    workspace.getUsers(), workspace.getItems(), workspace.getSwiftContainer(), workspace.getSwiftUrl());
            this.isAbeEncrypted = true;
        }
                
        public ABEWorkspace(UUID id, Integer latestRevision, User owner, byte[] access_struct, byte[] secretKey, byte[] publicKey) {
            super(id, latestRevision, owner, true, false);
            this.isAbeEncrypted = true;
            this.secretKey=secretKey;
            this.publicKey=publicKey;
            this.access_struct=access_struct;
        }

        public byte[] getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(byte[] secretKey) {
            this.secretKey = secretKey;
        }

        public byte[] getPublicKey() {
            return publicKey;
        }

        public void setPublicKey(byte[] publicKey) {
            this.publicKey = publicKey;
        }

        public byte[] getAccess_struct() {
            return access_struct;
        }

        public void setAccess_struct(byte[] access_struct) {
            this.access_struct = access_struct;
        }
        
        
}
