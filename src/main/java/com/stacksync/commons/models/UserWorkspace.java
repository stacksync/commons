package com.stacksync.commons.models;

import java.io.Serializable;
import java.util.Date;

public class UserWorkspace implements Serializable{

	private static final long serialVersionUID = 7732224675365732811L;
	
	private User user;
	private Workspace workspace;
	private boolean isOwner;
	private Date joinedAt;
        private String accessStruc;

	public UserWorkspace(User user, Workspace workspace) {
		super();
		this.user = user;
		this.workspace = workspace;
	}
        
        public UserWorkspace(User user, Workspace workspace, String access_struc) {
		super();
		this.user = user;
		this.workspace = workspace;
                this.accessStruc = access_struc;
	}
                
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Workspace getWorkspace() {
		return workspace;
	}
	public void setWorkspace(Workspace workspace) {
		this.workspace = workspace;
	}
	public boolean isOwner() {
		return isOwner;
	}
	public void setOwner(boolean isOwner) {
		this.isOwner = isOwner;
	}
	public Date getJoinedAt() {
		return joinedAt;
	}
	public void setJoinedAt(Date joinedAt) {
		this.joinedAt = joinedAt;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
        
        public String getAccessStruc() {
            return accessStruc;
        }

        public void setAccessStruc(String accessStruc) {
            this.accessStruc = accessStruc;
        }
        
        @Override
        public boolean equals(Object comparedWorkspace){
            
            if (comparedWorkspace != null && comparedWorkspace instanceof UserWorkspace)
            {
                return this.equals(comparedWorkspace);
            } else if (comparedWorkspace != null && comparedWorkspace instanceof String){
                return user.getEmail().equals(((UserWorkspace)comparedWorkspace).getUser().getEmail());
            }
            
            return false;
            
        }
        
}
