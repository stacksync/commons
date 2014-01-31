package com.stacksync.commons.exceptions;

public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 3524957553230371283L;

	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String message) {
		super(message);
	}

	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserNotFoundException(Throwable cause) {
		super(cause);
	}

}
