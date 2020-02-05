package BusTicket.BusList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import BusTicket.TestConnections;

public class BusTicketManagerImplimentation implements BusTicketManager {
/*	public void admin() throws Exception {

		System.out.println("Enter Admin_Name:");
		Scanner sc=new Scanner(System.in);
		String Admin=sc.next();
		System.out.println("Enter Password:");
		String pass=sc.next();
		BusTicketManagerImplimentation com=new BusTicketManagerImplimentation();
		if(com.AdminLogin(Admin,pass)) {
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
		BusTicketManagerImplimentation com=new BusTicketManagerImplimentation();
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
*/
	
	public void addBuslist(int BusNo, String BusName, String BusSource, String BusDestination, String Class) throws Exception {
		Connection con = TestConnections.getConnection();
		//String sql="insert into bus_list (bus_no,bus_name,bus_source,bus_destination,class)values+ (?,?,?,?,?)";//prepared statement needed
		String sql="insert into bus_list (bus_no,bus_name,bus_source,bus_destination,class)values ("+BusNo+",'"+BusName+"','"+BusSource+"','"+BusDestination+"','"+Class+"')";
		System.out.println(sql);
		Statement stmt=con.createStatement();
		int row=stmt.executeUpdate(sql);
		System.out.println(row);
	
	
	}
	public void deleteBuslist(int BusNo) throws Exception {
		Connection con = TestConnections.getConnection();
		String sql1="delete from seat_availability where bus_no=?";
		PreparedStatement pst1=con.prepareStatement(sql1);
		pst1.setInt(1, BusNo);
		pst1.executeUpdate();
		
		String sql="delete from bus_list where bus_no=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, BusNo);
		pst.executeUpdate();
		//System.out.println(sql);
		//Statement stmt=con.createStatement();
		//int row=stmt.executeUpdate(sql);
		//System.out.println(row);
		
		//PreparedStatement pst1=con.prepareStatement(sql1);
		//pst1.setInt(1, BusNo);
		//pst1.executeUpdate();
		//Statement stmt1=con.createStatement();
		System.out.println(BusNo+" Bus Details are delete successfully");
		con.close();
	}
	 public int NoOfBuses() throws Exception {
		 String sql="select count(*) as busCount  from bus_list"; 
		 System.out.println(sql);
		 Connection con = TestConnections.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			rs.next();
			//System.out.println(""+rs.getInt("busCount"));	
			return rs.getInt("busCount");
		 
	}
	 public HashMap<String,Integer> NoOfBuslist() throws Exception{
		 String sql="select bus_name,bus_no from bus_list";
		 System.out.println(sql);
		 Connection con = TestConnections.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			HashMap<String,Integer> obj=new HashMap<String,Integer>();
			while(rs.next()) {
			//System.out.println(""+rs.getString("bus_name"));
				String name=rs.getString("bus_name");
					int num=rs.getInt("bus_no");
					obj.put(name,num );
			}
			
		 return obj;
	 }
	 public List<ListOfBuses> SourceStationlist(String BusSource,String BusDestination) throws Exception {
		 String sql="select *from bus_list where bus_source='"+BusSource+"' and bus_destination='"+BusDestination+"'";
		 //System.out.println(sql);
		 System.out.println("BusNo:\tSource:\tDestination\tBusName:\tClass:");
		 Connection con = TestConnections.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			List<ListOfBuses> Source= new ArrayList<ListOfBuses>();
			while(rs.next()) {
				ListOfBuses p = new ListOfBuses();
				p.BusNo=rs.getInt("bus_no");
				p.BusName=rs.getString("bus_name");
				p.BusSource=rs.getString("bus_source");
				p.BusDestination=rs.getString("bus_destination");
				p.Class=rs.getString("class");
				Source.add(p);
				
			}
		 return Source;
	 }
	
}
