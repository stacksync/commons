package com.stacksync.commons.requests;

import java.io.Serializable;
import java.util.UUID;

public class UpdateDeviceRequest extends Request implements Serializable {

	protected static final long serialVersionUID = 3763327030154389990L;
	
	protected UUID deviceId;
	protected String deviceName;
	protected String os;
	protected String ip;
	protected String appVersion;

	public UpdateDeviceRequest(UUID userId, UUID deviceId, String deviceName, String os, String ip, String appVersion) {
		super(userId);
		
		this.deviceId = deviceId;
		this.deviceName = deviceName;
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

	public UUID getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(UUID deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

}
