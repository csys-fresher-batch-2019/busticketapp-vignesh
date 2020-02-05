package BusTicket.SeatAvailability;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAvailableSeats {

	public static void main(String[] args) throws Exception {
		SeatAvailabilityimplementation impl = new SeatAvailabilityimplementation();
		SeatAvailability obj = new SeatAvailability();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the BusNo Tocheck Available Seats:");
		obj.setBusNo(sc.nextInt());
		List<SeatAvailability> available = new ArrayList<SeatAvailability>();
		available= impl.AvailableSeatDetails(obj);
		 for (SeatAvailability p : available) {
			System.out.println(p.getBusNo()+"\t"+p.getAvailableSeats()); 
		}
		
		 
		 
		
	}

}