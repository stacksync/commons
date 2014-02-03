package com.stacksync.commons.requests;

import java.io.Serializable;
import java.util.UUID;

public class Request implements Serializable{
	
	private static final long serialVersionUID = -8509073150924914903L;
	
	private String requestId;
	private String userId;
	
	public Request(String userId){
		this.requestId = UUID.randomUUID().toString();
		this.userId = userId;
	}
	
	public Request(String requestId, String userId){
		this.requestId = requestId;
		this.userId = userId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
