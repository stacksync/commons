package com.stacksync.commons.models;

import java.io.Serializable;
import java.util.Date;

public class UserWorkspace implements Serializable{

	private static final long serialVersionUID = 7732224675365732811L;
	
	private User user;
	private Workspace workspace;
	private boolean isOwner;
	private Date joinedAt;

	public UserWorkspace(User user, Workspace workspace) {
		super();
		this.user = user;
		this.workspace = workspace;
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
	
	
}
