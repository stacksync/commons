package com.stacksync.commons.exceptions;

public class WorkspaceNotUpdatedException extends Exception {

	private static final long serialVersionUID = -6071666228076925379L;

	public WorkspaceNotUpdatedException() {
		super();
	}

	public WorkspaceNotUpdatedException(String message) {
		super(message);
	}

	public WorkspaceNotUpdatedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WorkspaceNotUpdatedException(Throwable cause) {
		super(cause);
	}

}