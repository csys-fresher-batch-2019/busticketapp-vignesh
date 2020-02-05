package BusTicket.Reservation;

import java.sql.Date;

public class ListReservation {
	int TicketNo;
	public  int BusNo;
	int PassengerId;
	int NoOfTicket;
	public String date;
	//public Date Journydate;
	int TotalAmount;
	/*@Override
	public String toString() {
		return "ListReservation [TicketNo=" + TicketNo + ", BusNo=" + BusNo + ", PassengerId=" + PassengerId
				+ ", NoOfTicket=" + NoOfTicket + ", Journydate=" + Journydate + "]";
	}*/
	@Override
	public String toString() {
		return "ListReservation [TicketNo=" + TicketNo + ", BusNo=" + BusNo + ", PassengerId=" + PassengerId
				+ ", NoOfTicket=" + NoOfTicket +  ", TotalAmount="
				+ TotalAmount + "]";
	}
	
	
	


}
