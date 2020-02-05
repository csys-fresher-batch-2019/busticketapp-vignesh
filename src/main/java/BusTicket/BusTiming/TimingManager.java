package BusTicket.BusTiming;

import java.time.LocalDateTime;

public interface TimingManager {
	void addBusTiming(ListBusTiming obj) throws Exception;
	void deleteBusTiming(int BusNo) throws Exception;

}
