package busticket.passenger;

import java.util.Scanner;

public class TestupdatePassenger {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the update PassengerId:");
		int PassengerId=sc.nextInt();
		System.out.println("Enter contact Number:");
		long PassengerContact=sc.nextLong();
		PassengerImplementation pasimpl = new PassengerImplementation();
		pasimpl.updatePassengerlist(PassengerContact, PassengerId);
	}

}
