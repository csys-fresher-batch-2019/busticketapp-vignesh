package busticket.passenger;

import java.sql.Connection;
import java.sql.Statement;

import com.chainsys.busticketapp.dao.PassengerDAO;
import com.chainsys.busticketapp.util.ConnectionUtil;

public class PassengerImplementation implements PassengerDAO {

	public void addPassengerlist(String passengerName, int passengerAge, String passengerGender, long passengerContact)
			throws Exception {
		String sql = "insert into passenger (pas_id,pas_name,pas_age,pas_gender,pas_contact)values (pas_id.nextval,'"
				+ passengerName + "'," + passengerAge + ",'" + passengerGender + "'," + passengerContact + ")";
		System.out.println(sql);
		Connection con = ConnectionUtil.getConnection();
		Statement stmt = con.createStatement();
		int row = stmt.executeUpdate(sql);
		System.out.println(row);

	}

	public void deletePassengerlist(int passengerId) throws Exception {

		String sql = "delete from passenger where pas_id=" + passengerId;
		System.out.println(sql);
		Connection con = ConnectionUtil.getConnection();
		Statement stmt = con.createStatement();
		int row = stmt.executeUpdate(sql);
		System.out.println(row);
	}

	public void updatePassengerlist(long passengerContact, int passengerId) throws Exception {

		String sql = "update passenger set pas_contact=" + passengerContact + " where pas_id= " + passengerId + "";
		System.out.println(sql);
		Connection con = ConnectionUtil.getConnection();
		Statement stmt = con.createStatement();
		int row = stmt.executeUpdate(sql);
		System.out.println(row);
	}

}
