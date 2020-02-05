package BusTicket.BusList;

import java.util.HashMap;
import java.util.List;

import BusTicket.BusList.ListOfBuses;

public interface BusTicketManager {
	//public  void admin() throws Exception;
	//public  void user() throws Exception;
	void addBuslist(int BusNo,String BusName,String BusSource,String BusDestination,String Class) throws Exception;
	void deleteBuslist(int BusNo) throws Exception;
	int NoOfBuses() throws Exception;
	HashMap<String,Integer> NoOfBuslist() throws Exception;
	public List<ListOfBuses> SourceStationlist(String BusSource,String BusDestination) throws Exception;
}
