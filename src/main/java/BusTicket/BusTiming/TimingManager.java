package BusTicket.BusTiming;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import BusTicket.Reservation.ListReservation;

public interface TimingManager {
	void addBusTiming(ListBusTiming obj) throws Exception;
	void deleteBusTiming(int BusNo) throws Exception;
	List<ListBusTiming> BustimeDetails() throws Exception;
	

}
