package BusTicket.Reservation;

import java.util.ArrayList;

public class TestResrvationAllList {

	public static void main(String[] args) throws Exception {
		ReservationImplementation impl = new ReservationImplementation();
		ArrayList<ListReservation> List=new ArrayList<ListReservation>();
		List=impl.ReserveDetails();
		for (ListReservation Reserve : List) {
			System.out.println(Reserve);
		}

	}

}
