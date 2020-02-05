package BusTicket.Reservation;

import java.util.Scanner;

public class TestCancelReservationList {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ReservationImplementation impl = new ReservationImplementation();
		System.out.println(" Delete ReservationList:\n Enter the TicketNo:");
		int TicketNo=sc.nextInt();
		impl.cancelReservationList(TicketNo);
	}

}
