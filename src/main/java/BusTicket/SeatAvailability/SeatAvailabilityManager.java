package BusTicket.SeatAvailability;

import java.util.List;

public interface SeatAvailabilityManager {
	public void addAvailableSeatlist(SeatAvailability obj) throws Exception;
	public void deleteAvailableSeatlist(int BusNo) throws Exception;
	public void updateAvailableSeatlist(int AvailableSeats,int BusNo) throws Exception;
	List<SeatAvailability> AvailableSeatDetails(SeatAvailability obj) throws Exception;

}
