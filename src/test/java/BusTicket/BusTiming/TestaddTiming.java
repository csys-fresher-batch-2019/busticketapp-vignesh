package busticket.bustiming;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.BusTimingIplementation;
import com.chainsys.busticketapp.model.ListBusTiming;

public class TestaddTiming {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BusTimingIplementation timeimpl= new BusTimingIplementation();
		ListBusTiming obj = new ListBusTiming();
		System.out.println("Enter the BusNo:");
		obj.setBusNo(sc.nextInt());
		System.out.println("Enter the Bus Amount:");
		obj.setAmount(sc.nextInt());
		System.out.println("Enter DepartureTime:");
		//obj.departureTime = LocalDateTime.now();
		obj.setDepartureTime(sc.next());
		System.out.println("Enter ArraivalTime:");
		//obj.arrivalTime = LocalDateTime.now();
		obj.setArrivalTime(sc.next());
		timeimpl.addBusTiming(obj);
		
		

	}

}
