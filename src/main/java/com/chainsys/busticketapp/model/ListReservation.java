package com.chainsys.busticketapp.model;

public class ListReservation {
	public int TicketNo;
	public int BusNo;
	public int PassengerId;
	public int NoOfTicket;
	public String date;
	// public Date Journydate;
	public int TotalAmount;

	/*
	 * @Override public String toString() { return "ListReservation [TicketNo=" +
	 * TicketNo + ", BusNo=" + BusNo + ", PassengerId=" + PassengerId +
	 * ", NoOfTicket=" + NoOfTicket + ", Journydate=" + Journydate + "]"; }
	 */
	@Override
	public String toString() {
		return "ListReservation [TicketNo=" + TicketNo + ", BusNo=" + BusNo + ", PassengerId=" + PassengerId
				+ ", NoOfTicket=" + NoOfTicket + ", TotalAmount=" + TotalAmount + "]";
	}

}
