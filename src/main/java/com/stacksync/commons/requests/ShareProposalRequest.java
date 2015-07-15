package com.stacksync.commons.requests;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class ShareProposalRequest extends Request implements Serializable {

	protected static final long serialVersionUID = -5985754297818659212L;

	protected List<String> emails;
        protected HashMap<String, HashMap<String,byte[]>> emailsKeys;
        protected byte[] publicKey;
	protected Long itemId;
	protected boolean isEncrypted;
        protected boolean abeEncrypted;

	public ShareProposalRequest(UUID userId, List<String> emails,
			Long itemId, boolean isEncrypted, boolean abeEncrypted) {
		super(userId);
		
		this.emails = emails;
		this.itemId = itemId;
		this.isEncrypted = isEncrypted;
                this.abeEncrypted = abeEncrypted;
	}
        
        public ShareProposalRequest(UUID userId, byte[] publickey, HashMap<String, HashMap<String,byte[]>> emailsKeys,
			Long itemId, boolean isEncrypted, boolean abeEncrypted) {
		super(userId);
		 
                emails = new ArrayList(Arrays.asList(emailsKeys.keySet().toArray()));

		this.emailsKeys = emailsKeys;
		this.itemId = itemId;
		this.isEncrypted = isEncrypted;
                this.abeEncrypted = abeEncrypted;
                this.publicKey = publickey;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public boolean isEncrypted() {
		return isEncrypted;
	}

	public void setEncrypted(boolean isEncrypted) {
		this.isEncrypted = isEncrypted;
	}

        public boolean isAbeEncrypted() {
            return abeEncrypted;
        }

        public void setAbeEncrypted(boolean abeEncrypted) {
            this.abeEncrypted = abeEncrypted;
        }
        
        public HashMap<String, HashMap<String,byte[]>> getEmailsKeys(){
            return this.emailsKeys;
        }
                
        public void setEmailsKeys(HashMap<String,HashMap<String,byte[]>> emailsKeys){
            this.emailsKeys = emailsKeys;
        }

        public byte[] getPublicKey() {
            return publicKey;
        }

        public void setPublicKey(byte[] publicKey) {
            this.publicKey = publicKey;
        }
        
}
