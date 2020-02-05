package busticket.bustiming;

import java.util.Scanner;

public class TestdeleteBusTiming {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the delete bus No:");
		int BusNo=sc.nextInt();
		BusTimingIplementation timeimpl= new BusTimingIplementation();
		timeimpl.deleteBusTiming(BusNo);

	}

}
