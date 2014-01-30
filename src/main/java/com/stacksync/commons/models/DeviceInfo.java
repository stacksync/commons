package com.stacksync.commons.models;


import java.io.Serializable;
import java.lang.reflect.Field;

public class DeviceInfo implements Serializable {

	private static final long serialVersionUID = 3763327030154389990L;
	private Long id;
	private String name;
	private String os;
	private String ip;
	private String appVersion;

	public DeviceInfo(Long id, String name, String os, String ip, String appVersion) {
		this.id = id;
		this.name = name;
		this.os = os;
		this.ip = ip;
		this.appVersion = appVersion;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isValid() {
		// TODO Auto-generated method stub
		return true;
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
