package BusTicket.BusTiming;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class TestaddTiming {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BusTimingIplementation timeimpl= new BusTimingIplementation();
		ListBusTiming obj = new ListBusTiming();
		System.out.println("Enter the BusNo:");
		obj.BusNo=sc.nextInt();
		System.out.println("Enter the Bus Amount:");
		obj.amount=sc.nextInt();
		System.out.println("Enter DepartureTime:");
		//obj.departureTime = LocalDateTime.now();
		obj.departureTime=sc.next();
		System.out.println("Enter ArraivalTime:");
		//obj.arrivalTime = LocalDateTime.now();
		obj.arrivalTime=sc.next();
		timeimpl.addBusTiming(obj);
		
		

	}

}
