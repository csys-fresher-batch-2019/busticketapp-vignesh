package busticket.reservation;

import java.util.ArrayList;

import com.chainsys.busticketapp.model.ListReservation;

public class TestResrvationAllList {

	public static void main(String[] args) throws Exception {
		ReservationImplementation impl = new ReservationImplementation();
		ArrayList<ListReservation> list = new ArrayList<ListReservation>();
		list = impl.reserveDetails();
		for (ListReservation reserve : list) {
			System.out.println(reserve);
		}

	}

}
