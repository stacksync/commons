package com.stacksync.commons.requests;

import java.io.Serializable;

public class GetWorkspacesRequest extends Request implements Serializable {

	protected static final long serialVersionUID = -3220770802300635288L;

	public GetWorkspacesRequest(String userId) {
		super(userId);
	}

}
