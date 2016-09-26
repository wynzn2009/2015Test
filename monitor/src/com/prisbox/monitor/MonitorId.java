package com.prisbox.monitor;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class MonitorId {
	private String consumerId;
	private String trId;
	private String channel;
	private String district;
	private EnumSet<MonitorEnum> enumSet;
	protected MonitorId(Monitor monitor,List<MonitorEnum> enumNames) {
		super();
		this.consumerId = monitor.getConsumerId();
		this.trId = monitor.getTrId();
		this.channel = monitor.getChannel();
		this.district = monitor.getDistrict();
		enumSet.addAll(enumSet);
	}
	
	public String getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public String getTrId() {
		return trId;
	}

	public void setTrId(String trId) {
		this.trId = trId;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public EnumSet<MonitorEnum> getEnumSet() {
		return enumSet;
	}

	public void setEnumSet(EnumSet<MonitorEnum> enumSet) {
		this.enumSet = enumSet;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hashcode = 0;
		Iterator<MonitorEnum> ite = enumSet.iterator();
		while(ite.hasNext()){
			hashcode += ite.hashCode();
		}
		return hashcode;
	}
	public boolean equals(MonitorId obj) {
		if(obj==null||!obj.getEnumSet().equals(this.enumSet)){
			return false;
		}
		Iterator<MonitorEnum> ite = enumSet.iterator();
		Class<? extends MonitorId> clazz = obj.getClass();
		while(ite.hasNext()){
			String name = ite.next().getMonitorName();
			try {
				if(!clazz.getDeclaredField(name).equals(this.getClass().getDeclaredField(name))){
					return false;
				}
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}
}
