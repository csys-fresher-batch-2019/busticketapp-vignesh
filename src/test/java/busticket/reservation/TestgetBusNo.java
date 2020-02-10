package busticket.reservation;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.ReservationImplementation;
import com.chainsys.busticketapp.model.ListReservation;

public class TestgetBusNo {

	public static void main(String[] args)throws Exception {
		ReservationImplementation impl = new ReservationImplementation();
		ListReservation obj=new ListReservation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ticketNo:");
        obj.setTicketNo(sc.nextInt());
		
		int busNo = impl.getBusNo(obj.getTicketNo());
		System.out.println(busNo);
	}

}
