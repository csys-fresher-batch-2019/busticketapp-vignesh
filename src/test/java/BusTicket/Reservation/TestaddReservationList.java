package BusTicket.Reservation;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class TestaddReservationList {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ReservationImplementation impl = new ReservationImplementation();
		ListReservation obj = new ListReservation();
		//System.out.println("Enter the TicketNo:");
		//obj.TicketNo=sc.nextInt();
		System.out.println("Enter the BusNo:");
		obj.BusNo=sc.nextInt();
		System.out.println("Enter the PassengerId:");
		obj.PassengerId=sc.nextInt();
		System.out.println("Enter the No of Ticket:");
		obj.NoOfTicket=sc.nextInt();
		//System.out.println("Enter journtDate:");
		//obj.date=sc.next();
		
		
		impl.addReservationList(obj);
	}

}
