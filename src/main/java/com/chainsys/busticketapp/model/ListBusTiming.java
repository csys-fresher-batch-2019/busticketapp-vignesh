package com.chainsys.busticketapp.model;

public class ListBusTiming {

	public int BusNo;
	public int amount;
	public String departureTime;
	public String arrivalTime;

	@Override
	public String toString() {
		return "ListBusTiming [BusNo=" + BusNo + ", amount=" + amount + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + "]";
	}

}
