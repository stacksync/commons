package com.stacksync.commons.exceptions;

public class WorkspaceNotCreatedException extends Exception {

	private static final long serialVersionUID = 6944126623777070419L;

	public WorkspaceNotCreatedException() {
		super();
	}

	public WorkspaceNotCreatedException(String message) {
		super(message);
	}

	public WorkspaceNotCreatedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WorkspaceNotCreatedException(Throwable cause) {
		super(cause);
	}

}
