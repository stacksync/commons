package com.stacksync.commons.exceptions;

public class UnshareProposalNotCreatedException extends Exception {

	private static final long serialVersionUID = 7171989915335803461L;

	public UnshareProposalNotCreatedException() {
		super();
	}

	public UnshareProposalNotCreatedException(String message) {
		super(message);
	}

	public UnshareProposalNotCreatedException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnshareProposalNotCreatedException(Throwable cause) {
		super(cause);
	}

}