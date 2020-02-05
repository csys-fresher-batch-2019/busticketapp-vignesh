package BusTicket.Passenger;

public class Passenger {
	public int BusNo;
	int PassengerId;
	String PassengerName;
	int PassengerAge;
	String  PassengerGender;
	long PassengerContact;
	@Override
	public String toString() {
		return "Passenger [BusNo=" + BusNo + ", PassengerId=" + PassengerId + ", PassengerName=" + PassengerName
				+ ", PassengerAge=" + PassengerAge + ", PassengerGender=" + PassengerGender + ", PassengerContact="
				+ PassengerContact + "]";
	}
	

}
