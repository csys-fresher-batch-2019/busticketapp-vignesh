package BusTicket.BusList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSearchbus {

	public static void main(String[] args) throws Exception{
		BusTicketManagerImplimentation Busimpl=new BusTicketManagerImplimentation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source Name:");
		String Source=sc.next();
		System.out.println("Enter Destination Name:");
		String Destination=sc.next();
		List<ListOfBuses> SourceTest=new ArrayList<ListOfBuses>();
		SourceTest= Busimpl.SourceStationlist(Source,Destination);
	
	     for (ListOfBuses p : SourceTest) {
	    	 System.out.println(p.BusNo+"\t"+p.BusSource+"\t"+p.BusDestination+"\t\t"+p.BusName+"\t\t"+p.Class);
			
		}
	
	}
	
	

}