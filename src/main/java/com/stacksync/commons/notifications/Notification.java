package com.stacksync.commons.notifications;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.UUID;

public class Notification implements Serializable {

	private static final long serialVersionUID = 5850418366116658341L;
	
	private String requestId;
	
	public Notification(){
		this.requestId = UUID.randomUUID().toString();
	}
	
	public Notification(String requestId){
		this.requestId = requestId;
	}
	
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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
