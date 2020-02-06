package com.chainsys.busticketapp.dao;

import java.util.HashMap;
import java.util.List;

import com.chainsys.busticketapp.model.ListOfBuses;

public interface BusTicketDAO {
	// public void admin() throws Exception;
	// public void user() throws Exception;
	void addBuslist(int BusNo, String BusName, String BusSource, String BusDestination, String Class) throws Exception;

	void deleteBuslist(int BusNo) throws Exception;

	int noOfBuses() throws Exception;

	HashMap<String, Integer> noOfBuslist() throws Exception;

	public List<ListOfBuses> sourceStationlist(String BusSource, String BusDestination) throws Exception;
}
