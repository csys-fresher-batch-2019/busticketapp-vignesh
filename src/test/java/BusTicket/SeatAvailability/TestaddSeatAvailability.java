package BusTicket.SeatAvailability;

import java.util.Scanner;

public class TestaddSeatAvailability {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		SeatAvailabilityimplementation impl = new SeatAvailabilityimplementation();
		SeatAvailability obj = new SeatAvailability();
		System.out.println("Enter the BusNo:");
		obj.setBusNo(sc.nextInt());
		System.out.println("Enter the Available Seats:");
		obj.setAvailableSeats(sc.nextInt());
		System.out.println("Enter the Total Seats:");
		obj.TotalSeats=sc.nextInt();
		impl.addAvailableSeatlist(obj);
		
	}

}