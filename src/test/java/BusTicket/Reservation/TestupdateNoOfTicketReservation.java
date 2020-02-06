package busticket.reservation;

import java.util.Scanner;

import com.chainsys.busticketapp.model.ListReservation;

public class TestupdateNoOfTicketReservation {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ReservationImplementation impl = new ReservationImplementation();
		ListReservation obj = new ListReservation();
		System.out.println("Update Ticket Reservation");
		System.out.println("Enter the Ticket No:");
		obj.setTicketNo(sc.nextInt());
		System.out.println("Enter PassengerId:");
		obj.setPassengerId(sc.nextInt());
		System.out.println("Update NoOfTicket:");
		obj.setNoOfTicket(sc.nextInt());
		impl.updateNoOfTicket(obj.getTicketNo(), obj.getPassengerId(), obj.getNoOfTicket());
	}

}
