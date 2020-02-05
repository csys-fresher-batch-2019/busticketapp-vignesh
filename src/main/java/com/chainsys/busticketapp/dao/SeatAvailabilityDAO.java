package com.chainsys.busticketapp.dao;

import java.util.List;

import com.chainsys.busticketapp.model.SeatAvailability;

public interface SeatAvailabilityDAO {
	public void addAvailableSeatlist(SeatAvailability obj) throws Exception;

	public void deleteAvailableSeatlist(int BusNo) throws Exception;

	public void updateAvailableSeatlist(int AvailableSeats, int BusNo) throws Exception;

	List<SeatAvailability> AvailableSeatDetails(SeatAvailability obj) throws Exception;

}
