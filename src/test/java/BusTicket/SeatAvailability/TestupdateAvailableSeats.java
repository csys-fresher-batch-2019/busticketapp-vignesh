package BusTicket.SeatAvailability;

import java.util.Scanner;

public class TestupdateAvailableSeats {

	public static void main(String[] args) throws Exception {
		SeatAvailability obj = new SeatAvailability();
		Scanner sc = new Scanner(System.in);
		SeatAvailabilityimplementation impl = new SeatAvailabilityimplementation();
		System.out.println("Update AvailableSeats:");
		obj.setAvailableSeats(sc.nextInt());
		System.out.println("Enter the BusNo:");
		obj.setBusNo(sc.nextInt());
		impl.updateAvailableSeatlist(obj.getAvailableSeats(), obj.getBusNo());
	}

}
