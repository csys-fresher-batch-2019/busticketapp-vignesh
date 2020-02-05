package com.chainsys.busticketapp.dao;

import java.util.ArrayList;

import com.chainsys.busticketapp.model.ListReservation;

public interface ReservationDAO {
	void addReservationList(ListReservation obj) throws Exception;

	void cancelReservationList(int BusNo) throws Exception;

	ArrayList<ListReservation> ReserveDetails() throws Exception;

	public void updateNoOfTicket(int TicketNo, int PassengerId, int NoOfTicket) throws Exception;

}
