package com.chainsys.busticketapp.dao;

import java.util.ArrayList;

import com.chainsys.busticketapp.model.ListReservation;

public interface ReservationDAO {
	void addReservationList(ListReservation obj) throws Exception;

	void cancelReservationList(int busNo) throws Exception;

	ArrayList<ListReservation> reserveDetails() throws Exception;

	public void updateNoOfTicket(int ticketNo, int passengerId, int noOfTicket) throws Exception;

}
