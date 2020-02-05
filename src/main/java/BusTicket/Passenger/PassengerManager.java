package BusTicket.Passenger;

public interface PassengerManager {
	public void addPassengerlist(String PassengerName,int PassengerAge,String PassengerGender,long PassengerContact) throws Exception;
	public void deletePassengerlist(int PassengerId) throws Exception;
	public void updatePassengerlist(long PassengerContact,int PassengerId) throws Exception;
	

}
