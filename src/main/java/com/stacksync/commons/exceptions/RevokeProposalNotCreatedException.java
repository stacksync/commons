package com.stacksync.commons.exceptions;

public class RevokeProposalNotCreatedException extends Exception {

	private static final long serialVersionUID = 7171989915335803461L;

	public RevokeProposalNotCreatedException() {
		super();
	}

	public RevokeProposalNotCreatedException(String message) {
		super(message);
	}

	public RevokeProposalNotCreatedException(String message, Throwable cause) {
		super(message, cause);
	}

	public RevokeProposalNotCreatedException(Throwable cause) {
		super(cause);
	}

}