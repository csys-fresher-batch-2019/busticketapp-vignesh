package busticket.passenger;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.PassengerImplementation;
import com.chainsys.busticketapp.model.Passenger;

public class TestAddPassenger {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		Passenger obj= new Passenger();
		System.out.println("Enter the Passenger Name:");
		obj.setPassengerName(sc.next());
		System.out.println("Enter the Passenger Age:");
		obj.setPassengerAge(sc.nextInt());
		System.out.println("Enter the Passenger Gender:");
		obj.setPassengerGender(sc.next());
		System.out.println("Enter the Contact Number");
		obj.setPassengerContact(sc.nextLong());
		PassengerImplementation pasimpl = new PassengerImplementation();
		//pasimpl.addPassengerlist("navin",25,"Male",7733322212l);
		pasimpl.addPassengerlist(obj);
	}

}
