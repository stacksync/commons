package com.stacksync.commons.requests;

import java.io.Serializable;

public class GetAccountRequest extends Request implements Serializable {

	protected static final long serialVersionUID = 250731596445890199L;
	
	protected String email;

	public GetAccountRequest(String email) {
		super("");
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
