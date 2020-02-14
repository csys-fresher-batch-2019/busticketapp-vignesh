package com.chainsys.busticketapp.util;

import java.util.ArrayList;

import com.chainsys.busticketapp.DBException;
import com.chainsys.busticketapp.dao.ReservationDAO;
import com.chainsys.busticketapp.dao.impl.ReservationImplementation;
import com.chainsys.busticketapp.model.ListReservation;

public class ServiceReservation {
	private ReservationDAO reservation = new ReservationImplementation();

	void addReservationList(ListReservation obj) throws Exception {
		reservation.addReservationList(obj);
	}

	void cancelReservationList(int busNo) throws Exception {
		reservation.cancelReservationList(busNo);
	}

	ArrayList<ListReservation> reserveDetails() throws Exception {
		ArrayList<ListReservation> reserveDetails = new ArrayList<>();
		try{
			reserveDetails=reservation.reserveDetails();
		}catch (DBException e) {
			throw new ServiceException(e.getMessage());
	}
		return reserveDetails;
	}
	public int getBusNo(int ticketNo) throws DBException {
		int ticketNumber;
		try {
			ticketNumber = reservation.getBusNo(ticketNo);
		} catch (DBException e) {
			throw new ServiceException(e.getMessage());
		}
		return ticketNumber;
	}

	public void updateNoOfTicket(int ticketNo, int passengerId, int noOfTicket) throws Exception {
		reservation.updateNoOfTicket(ticketNo, passengerId, noOfTicket);
	}

}
