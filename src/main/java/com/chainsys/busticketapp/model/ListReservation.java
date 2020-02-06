package com.chainsys.busticketapp.model;

public class ListReservation {

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public int getNoOfTicket() {
		return noOfTicket;
	}

	public void setNoOfTicket(int noOfTicket) {
		this.noOfTicket = noOfTicket;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	private int ticketNo;
	private int busNo;
	private int passengerId;
	private int noOfTicket;
	private String date;
	private int totalAmount;

	@Override
	public String toString() {
		return "ListReservation [ticketNo=" + ticketNo + ", busNo=" + busNo + ", passengerId=" + passengerId
				+ ", noOfTicket=" + noOfTicket + ", date=" + date + ", totalAmount=" + totalAmount + "]";
	}

}
