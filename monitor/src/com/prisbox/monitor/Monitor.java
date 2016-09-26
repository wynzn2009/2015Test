package com.prisbox.monitor;

public class Monitor {
	private String consumerId;
	private String trId;
	private String channel;
	private String district;
	private long trcount;
	private long avr;
	private long max;
	private long min;
	private String maxTime;
	private String minTime;
	private String errCount;
	private long errs;

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

	public long getTrcount() {
		return trcount;
	}

	public void setTrcount(long trcount) {
		this.trcount = trcount;
	}

	public long getMax() {
		return max;
	}

	public void setMax(long max) {
		this.max = max;
	}

	public long getMin() {
		return min;
	}

	public void setMin(long min) {
		this.min = min;
	}

	public String getMaxTime() {
		return maxTime;
	}

	public void setMaxTime(String maxTime) {
		this.maxTime = maxTime;
	}

	public String getMinTime() {
		return minTime;
	}

	public void setMinTime(String minTime) {
		this.minTime = minTime;
	}

	public String getErrCount() {
		return errCount;
	}

	public void setErrCount(String errCount) {
		this.errCount = errCount;
	}

	public long getErrs() {
		return errs;
	}

	public void setErrs(long errs) {
		this.errs = errs;
	}

	public long getAvr() {
		return avr;
	}

	public void setAvr(long avr) {
		this.avr = avr;
	}

}
