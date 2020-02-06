package busticket.reservation;

import java.util.Scanner;

import com.chainsys.busticketapp.model.ListReservation;

public class TestaddReservationList {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ReservationImplementation impl = new ReservationImplementation();
		ListReservation obj = new ListReservation();
		// System.out.println("Enter the TicketNo:");
		// obj.TicketNo=sc.nextInt();
		System.out.println("Enter the BusNo:");
		obj.setBusNo(sc.nextInt());
		System.out.println("Enter the PassengerId:");
		obj.setPassengerId(sc.nextInt());
		System.out.println("Enter the No of Ticket:");
		obj.setNoOfTicket(sc.nextInt());
		// System.out.println("Enter journtDate:");
		// obj.date=sc.next();

		impl.addReservationList(obj);
	}

}
