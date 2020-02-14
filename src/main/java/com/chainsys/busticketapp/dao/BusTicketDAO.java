package com.chainsys.busticketapp.dao;

import java.util.HashMap;
import java.util.List;

import com.chainsys.busticketapp.DBException;
import com.chainsys.busticketapp.model.ListOfBuses;

public interface BusTicketDAO {
	
	void addBuslist(int busNo, String busName, String busSource, String busDestination, String clazz) throws Exception;

	void deleteBuslist(int busNo) throws Exception;

	int noOfBuses() throws Exception;

	HashMap<String, Integer> noOfBuslist() throws Exception;

	public List<ListOfBuses> sourceStationlist(String busSource, String busDestination) throws DBException;
}

