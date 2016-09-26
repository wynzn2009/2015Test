package com.prisbox.monitor;

public enum MonitorEnum {
	CONSUMER_ID("consumerId"),TR_ID("trId"),DISTRICT("district"),CHANNEL("channel");
	private String monitorName;
	private MonitorEnum(String monitorName){
		this.monitorName = monitorName;
	}
	public String getMonitorName() {
		return monitorName;
	}
	public void setMonitorName(String monitorName) {
		this.monitorName = monitorName;
	}
}
