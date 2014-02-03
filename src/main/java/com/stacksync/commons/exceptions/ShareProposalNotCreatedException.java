package com.stacksync.commons.exceptions;

public class ShareProposalNotCreatedException extends Exception {

	private static final long serialVersionUID = 7171989915335803461L;

	public ShareProposalNotCreatedException() {
		super();
	}

	public ShareProposalNotCreatedException(String message) {
		super(message);
	}

	public ShareProposalNotCreatedException(String message, Throwable cause) {
		super(message, cause);
	}

	public ShareProposalNotCreatedException(Throwable cause) {
		super(cause);
	}

}