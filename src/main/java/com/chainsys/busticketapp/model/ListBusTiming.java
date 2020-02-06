package com.chainsys.busticketapp.model;

public class ListBusTiming {

	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	private int busNo;
	private int amount;
	private String departureTime;
	private String arrivalTime;
	@Override
	public String toString() {
		return "ListBusTiming [busNo=" + busNo + ", amount=" + amount + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + "]";
	}

	

}
