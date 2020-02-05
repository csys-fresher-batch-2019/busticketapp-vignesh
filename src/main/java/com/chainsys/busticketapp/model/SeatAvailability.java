package com.chainsys.busticketapp.model;

public class SeatAvailability {
	private int BusNo;
	private int AvailableSeats;
	public int TotalSeats;

	public int getBusNo() {
		return BusNo;
	}

	public void setBusNo(int busNo) {
		BusNo = busNo;
	}

	public int getAvailableSeats() {
		return AvailableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		AvailableSeats = availableSeats;
	}

	@Override
	public String toString() {
		return "SeatAvailability [BusNo=" + BusNo + ", AvailableSeats=" + AvailableSeats + ", TotalSeats=" + TotalSeats
				+ "]";
	}

}
