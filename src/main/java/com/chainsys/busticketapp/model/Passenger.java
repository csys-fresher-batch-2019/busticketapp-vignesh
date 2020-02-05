package com.chainsys.busticketapp.model;

public class Passenger {
	public int BusNo;
	public int PassengerId;
	public String PassengerName;
	public int PassengerAge;
	public String PassengerGender;
	public long PassengerContact;

	@Override
	public String toString() {
		return "Passenger [BusNo=" + BusNo + ", PassengerId=" + PassengerId + ", PassengerName=" + PassengerName
				+ ", PassengerAge=" + PassengerAge + ", PassengerGender=" + PassengerGender + ", PassengerContact="
				+ PassengerContact + "]";
	}

}
