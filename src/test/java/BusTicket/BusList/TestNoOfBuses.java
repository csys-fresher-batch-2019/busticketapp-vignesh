package BusTicket.BusList;

import BusTicket.BusList.BusTicketManagerImplimentation;

public class TestNoOfBuses {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BusTicketManagerImplimentation Busimpl=new BusTicketManagerImplimentation();
		
		int count=Busimpl.NoOfBuses();
		System.out.println(count);
	

	}

}
