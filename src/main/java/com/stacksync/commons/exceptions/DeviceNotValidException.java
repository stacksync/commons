package com.stacksync.commons.exceptions;

public class DeviceNotValidException extends Exception {
	
	private static final long serialVersionUID = -5029097263469786400L;

	public DeviceNotValidException() {
		super();
	}

	public DeviceNotValidException(String message) {
		super(message);
	}

	public DeviceNotValidException(String message, Throwable cause) {
		super(message, cause);
	}

	public DeviceNotValidException(Throwable cause) {
		super(cause);
	}
}
