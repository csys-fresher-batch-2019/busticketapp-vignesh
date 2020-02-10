package busticket.buslist;
import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.BusTicketManagerImplimentation;
//TestBusTicket
public class TestAddBusList {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the BusNo:");
		int busNo = sc.nextInt();
		
		System.out.println("Enter the Busname:");
		String busName = sc.next();
		
		System.out.println("Enter the busSource:");
		String busSource = sc.next();
		
		System.out.println("Enter the busDestination:");
		String busDestination = sc.next();
		
		System.out.println("Enter the busClass:");
		String clazz =sc.next();
		
		BusTicketManagerImplimentation busimpl=new BusTicketManagerImplimentation();
		//Busimpl.addBuslist(1244,"abcd","kovai","madurai","sleeper");
		
		busimpl.addBuslist(busNo,busName,busSource,busDestination,clazz);
		
	}

}
