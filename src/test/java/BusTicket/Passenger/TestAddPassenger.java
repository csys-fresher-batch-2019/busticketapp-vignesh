package busticket.passenger;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.PassengerImplementation;

public class TestAddPassenger {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Passenger Name:");
		String name=sc.next();
		System.out.println("Enter the Passenger Age:");
		int age=sc.nextInt();
		System.out.println("Enter the Passenger Gender:");
		String gender=sc.next();
		System.out.println("Enter the Contact Number");
		long number=sc.nextLong();
		PassengerImplementation pasimpl = new PassengerImplementation();
		//pasimpl.addPassengerlist("navin",25,"Male",7733322212l);
		pasimpl.addPassengerlist(name,age,gender,number);
	}

}
