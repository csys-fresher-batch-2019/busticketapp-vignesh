package com.chainsys.busticketapp.dao;

import java.util.HashMap;
import java.util.List;

import com.chainsys.busticketapp.model.ListOfBuses;

public interface BusTicketDAO {
	// public void admin() throws Exception;
	// public void user() throws Exception;
	void addBuslist(int BusNo, String BusName, String BusSource, String BusDestination, String Class) throws Exception;

	void deleteBuslist(int BusNo) throws Exception;

	int NoOfBuses() throws Exception;

	HashMap<String, Integer> NoOfBuslist() throws Exception;

	public List<ListOfBuses> SourceStationlist(String BusSource, String BusDestination) throws Exception;
}
