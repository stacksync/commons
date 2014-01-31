package com.stacksync.commons.exceptions;

public class DeviceNotUpdatedException  extends Exception {

	private static final long serialVersionUID = -4863718030211921279L;

	public DeviceNotUpdatedException() {
		super();
	}

	public DeviceNotUpdatedException(String message) {
		super(message);
	}

	public DeviceNotUpdatedException(String message, Throwable cause) {
		super(message, cause);
	}

	public DeviceNotUpdatedException(Throwable cause) {
		super(cause);
	}

}
