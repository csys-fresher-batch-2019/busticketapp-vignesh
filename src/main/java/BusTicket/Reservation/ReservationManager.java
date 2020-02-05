package BusTicket.Reservation;

import java.util.ArrayList;

public interface ReservationManager {
	void addReservationList(ListReservation obj) throws Exception;
	void cancelReservationList(int BusNo) throws Exception;
	ArrayList<ListReservation> ReserveDetails() throws Exception;
	public void updateNoOfTicket(int TicketNo,int PassengerId,int NoOfTicket) throws Exception;
	
		
}
