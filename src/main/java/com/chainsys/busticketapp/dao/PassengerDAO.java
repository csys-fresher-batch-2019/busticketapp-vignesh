package com.chainsys.busticketapp.dao;

public interface PassengerDAO {
	public void addPassengerlist(String passengerName, int passengerAge, String passengerGender, long passengerContact)
			throws Exception;

	public void deletePassengerlist(int passengerId) throws Exception;

	public void updatePassengerlist(long passengerContact, int passengerId) throws Exception;

}
