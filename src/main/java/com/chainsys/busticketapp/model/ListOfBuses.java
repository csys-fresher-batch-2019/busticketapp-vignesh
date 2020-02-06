package com.chainsys.busticketapp.model;

public class ListOfBuses {

	private int busNo;

	@Override
	public String toString() {
		return "ListOfBuses [busNo=" + busNo + ", busName=" + busName + ", busSource=" + busSource + ", busDestination="
				+ busDestination + ", clazz=" + clazz + "]";
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getBusSource() {
		return busSource;
	}

	public void setBusSource(String busSource) {
		this.busSource = busSource;
	}

	public String getBusDestination() {
		return busDestination;
	}

	public void setBusDestination(String busDestination) {
		this.busDestination = busDestination;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	private String busName;
	private String busSource;
	private String busDestination;
	private String clazz;

}