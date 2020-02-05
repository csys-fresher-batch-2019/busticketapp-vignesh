package BusTicket.SeatAvailability;

import java.util.Scanner;

public class TestdeleteAvailableSeats {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		SeatAvailabilityimplementation impl = new SeatAvailabilityimplementation();
		System.out.println("Enter the delete bus NO:");
		int BusNo=sc.nextInt();
		impl.deleteAvailableSeatlist(BusNo);
		
	}

}
