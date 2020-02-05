package BusTicket.Passenger;

import java.sql.Connection;
import java.sql.Statement;

import BusTicket.TestConnections;

public class PassengerImplementation implements PassengerManager {

	public void addPassengerlist(String PassengerName,int PassengerAge,String PassengerGender,long PassengerContact) throws Exception
	{
		String sql="insert into passenger (pas_id,pas_name,pas_age,pas_gender,pas_contact)values (pas_id.nextval,'"+PassengerName+"',"+PassengerAge+",'"+PassengerGender+"',"+PassengerContact+")";	
		System.out.println(sql);
		Connection con = TestConnections.getConnection();
		Statement stmt=con.createStatement();
		int row=stmt.executeUpdate(sql);
		System.out.println(row);
		
	}
	public void deletePassengerlist(int PassengerId) throws Exception {
	
		String sql="delete from passenger where pas_id="+PassengerId;
		System.out.println(sql);
		Connection con = TestConnections.getConnection();
		Statement stmt=con.createStatement();
		int row=stmt.executeUpdate(sql);
		System.out.println(row);
	}
	public void updatePassengerlist(long PassengerContact,int PassengerId) throws Exception {
		
		String sql="update passenger set pas_contact="+PassengerContact+" where pas_id= "+PassengerId+"";
		System.out.println(sql);
		Connection con = TestConnections.getConnection();
		Statement stmt=con.createStatement();
		int row=stmt.executeUpdate(sql);
		System.out.println(row);
	}

}