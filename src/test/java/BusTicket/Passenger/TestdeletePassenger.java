package busticket.passenger;

import java.util.Scanner;

public class TestdeletePassenger {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the delete bus id:");
		int passengerId = sc.nextInt();
		PassengerImplementation pasimpl = new PassengerImplementation();
		pasimpl.deletePassengerlist(passengerId);

	}

}
