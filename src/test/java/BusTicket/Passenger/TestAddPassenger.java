package BusTicket.Passenger;

import java.util.Scanner;

public class TestAddPassenger {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Passenger Name:");
		String Name=sc.next();
		System.out.println("Enter the Passenger Age:");
		int Age=sc.nextInt();
		System.out.println("Enter the Passenger Gender:");
		String Gender=sc.next();
		System.out.println("Enter the Contact Number");
		long Number=sc.nextLong();
		PassengerImplementation pasimpl = new PassengerImplementation();
		//pasimpl.addPassengerlist("navin",25,"Male",7733322212l);
		pasimpl.addPassengerlist(Name,Age,Gender,Number);
	}

}
