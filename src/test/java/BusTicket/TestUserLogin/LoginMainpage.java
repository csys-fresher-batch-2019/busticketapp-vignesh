package busticket.testuserlogin;

import java.util.Scanner;

import busticket.buslist.TestAddBusList;
import busticket.buslist.TestNoOfBuses;
import busticket.buslist.TestNoOfBuslist;
import busticket.buslist.TestSearchbus;
import busticket.buslist.TestdeleteBuslist;
import busticket.bustiming.TestaddTiming;
import busticket.bustiming.TestdeleteBusTiming;
import busticket.bustiming.TestlistBusTiming;
import busticket.login.LoginDAOImplementation;
import busticket.passenger.TestAddPassenger;
import busticket.passenger.TestdeletePassenger;
import busticket.passenger.TestupdatePassenger;
import busticket.reservation.TestCancelReservationList;
import busticket.reservation.TestResrvationAllList;
import busticket.reservation.TestaddReservationList;
import busticket.reservation.TestupdateNoOfTicketReservation;
import busticket.seatavailability.TestAvailableSeats;
import busticket.seatavailability.TestaddSeatAvailability;
import busticket.seatavailability.TestupdateAvailableSeats;

public class LoginMainpage {

	public static void main(String[] args)throws Exception {
	admin();	
	user();
	}
		
		public static void admin() throws Exception {

			System.out.println("Enter Admin_Name:");
			Scanner sc=new Scanner(System.in);
			String Admin=sc.next();
			System.out.println("Enter Password:");
			String pass=sc.next();
			LoginDAOImplementation com=new LoginDAOImplementation();
			if(com.AdminLogin(Admin, pass)) {
			System.out.println(">>>>LOGIN SUCESSFULL<<<<");
			//view order details
			System.out.println("1.Add BusList:\n2.2.Delete BusList:\n3.Delete PassengerList:\n4.Add BusTiming\n5.Delete BusTimimng\n6.Delete Reservationlist\n7.All ReservationList\n8.Add Seat Availability\n9.Update Seat Availability");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				TestAddBusList.main(null);
				break;
			case 2:
				TestdeleteBuslist.main(null);
				break;
			case 3:
				TestdeletePassenger.main(null);
				break;
			case 4:
				TestaddTiming.main(null);
				break;
			case 5:
				TestdeleteBusTiming.main(null);
				break;
			case 6:
				TestCancelReservationList.main(null);
				break;
			case 7:
				TestResrvationAllList.main(null);
				break;
			case 8:
				TestaddSeatAvailability.main(null);
				break;
			case 9:
				TestupdateAvailableSeats.main(null);
				break;
				default:
					System.out.println("Choose Correct Option:");
			}
			}
			else
			{
			System.out.println(">>>>LOGIN FAILED<<<<");
			}

			}
			
		public static void user() throws Exception {
			System.out.println("Enter UserName:");
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			System.out.println("Enter Password:");
			String pass=sc.next();
			LoginDAOImplementation com=new LoginDAOImplementation();
		if(com.user(name,pass)) {
			System.out.println(">>>>LOGIN SUCESSFULL<<<<");
	//view bus details
			System.out.println("1.No_Of_BusList:\n2.No_Of_Buses:\n3.Source And DestinationList:\n4.Available Seats:\n5:Add Passenger Details:\n6.Add ReservationList:\n7.Update PassengerDetails:\n8.Update No_Of_Ticket:");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("No_Of_BusList:");
				TestNoOfBuslist.main(null);
				break;
			case 2:
				TestNoOfBuses.main(null);
				break;
			case 3:
				TestSearchbus.main(null);
				break;
			case 4:
				TestAvailableSeats.main(null);
				break;
			case 5:
				TestAddPassenger.main(null);
				break;
			case 6:
				TestaddReservationList.main(null);
				break;
			case 7:
				TestupdatePassenger.main(null);
				break;
			case 8:
				TestupdateNoOfTicketReservation.main(null);
				break;
			case 9:
				TestlistBusTiming.main(null);
				break;
			default:
				System.out.println("Choose Correct Option:");

			}
			
	}
	else
	{
		System.out.println("--------LOGIN FAILED---------");
	}

	}


	}

