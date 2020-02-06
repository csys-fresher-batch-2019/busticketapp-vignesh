package com.chainsys.busticketapp.dao;

import java.util.List;

import com.chainsys.busticketapp.model.SeatAvailability;

public interface SeatAvailabilityDAO {
	public void addAvailableSeatlist(SeatAvailability obj) throws Exception;

	public void deleteAvailableSeatlist(int busNo) throws Exception;

	public void updateAvailableSeatlist(int availableSeats, int busNo) throws Exception;

	List<SeatAvailability> availableSeatDetails(SeatAvailability obj) throws Exception;

}
