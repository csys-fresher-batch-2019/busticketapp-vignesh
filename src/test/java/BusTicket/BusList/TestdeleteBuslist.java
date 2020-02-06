package busticket.buslist;

import java.util.Scanner;

public class TestdeleteBuslist {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the delete bus No:");
		int busid=sc.nextInt();
		BusTicketManagerImplimentation busimpl=new BusTicketManagerImplimentation();
		busimpl.deleteBuslist(busid);
		
	}

}
