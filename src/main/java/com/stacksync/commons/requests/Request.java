package com.stacksync.commons.requests;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.UUID;

public class Request implements Serializable{
	
	private static final long serialVersionUID = -8509073150924914903L;
	
	private String requestId;
	private String userId;
	
	public Request(String userId){
		this.requestId = UUID.randomUUID().toString();
		this.userId = userId;
	}
	
	public Request(String requestId, String userId){
		this.requestId = requestId;
		this.userId = userId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();

		result.append(this.getClass().getName());
		result.append(" {");

		// determine fields declared in this class only (no fields of
		// superclass)
		Field[] fields = this.getClass().getDeclaredFields();

		// print field names paired with their values
		for (Field field : fields) {
			result.append("  ");
			try {
				result.append(field.getName());
				result.append(": ");
				// requires access to private field:
				result.append(field.get(this));
			} catch (IllegalAccessException ex) {
				System.out.println(ex);
			}
		}
		result.append("}");

		return result.toString();
	}

}
