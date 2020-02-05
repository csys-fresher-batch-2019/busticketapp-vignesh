package com.chainsys.busticketapp.dao;

import java.util.List;

import com.chainsys.busticketapp.model.ListBusTiming;

public interface TimingDAO {
	void addBusTiming(ListBusTiming obj) throws Exception;

	void deleteBusTiming(int BusNo) throws Exception;

	List<ListBusTiming> BustimeDetails() throws Exception;

}
