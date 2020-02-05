package BusTicket.Login;
import BusTicket.TestConnections;
import BusTicket.BusList.BusTicketManagerImplimentation;
import BusTicket.BusList.TestAddBusList;
import BusTicket.BusList.TestNoOfBuses;
import BusTicket.BusList.TestNoOfBuslist;
import BusTicket.BusList.TestSearchbus;
import BusTicket.BusList.TestdeleteBuslist;
import BusTicket.BusTiming.TestaddTiming;
import BusTicket.BusTiming.TestdeleteBusTiming;
import BusTicket.Passenger.TestAddPassenger;
import BusTicket.Passenger.TestdeletePassenger;
import BusTicket.Passenger.TestupdatePassenger;
import BusTicket.Reservation.TestCancelReservationList;
import BusTicket.Reservation.TestResrvationAllList;
import BusTicket.Reservation.TestaddReservationList;
import BusTicket.Reservation.TestupdateNoOfTicketReservation;
import BusTicket.SeatAvailability.TestAvailableSeats;
import BusTicket.SeatAvailability.TestaddSeatAvailability;
import BusTicket.SeatAvailability.TestupdateAvailableSeats;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class LoginDAOImplementation implements LoginDAO {
	public void admin() throws Exception {

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
		public boolean AdminLogin(String Adminname, String pass) throws Exception
		{
			Connection con = TestConnections.getConnection();
				Statement stmt = con.createStatement();
		if (stmt.executeUpdate("select Admin_name from AdminRegister where Admin_name='" + Adminname + "'") != 0)
		{
		ResultSet rs = stmt.executeQuery("select pass_word from AdminRegister where Admin_name ='" + Adminname + "'");
		rs.next();
		if (pass.equals(rs.getString("pass_word")))
		{
		return true;
		}

		return false;
		}
		return false;
		}
// user Login
		

public boolean user(String name, String pass) throws Exception {

	Connection con = TestConnections.getConnection();
	Statement stmt = con.createStatement();
	if (stmt.executeUpdate("select name from UserRegister where name='" + name + "'") != 0)
	{
		ResultSet rs = stmt.executeQuery("select password from UserRegister where name='" + name + "'");
		rs.next();
		if (pass.equals(rs.getString("password")))
		{
			return true;
}

		return false;
}
	return false;
}
	public void user() throws Exception {
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
