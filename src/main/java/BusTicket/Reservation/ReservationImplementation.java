package busticket.reservation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.chainsys.busticketapp.dao.ReservationDAO;
import com.chainsys.busticketapp.model.ListReservation;
import com.chainsys.busticketapp.util.ConnectionUtil;

public class ReservationImplementation implements ReservationDAO {
	ListReservation obj = new ListReservation();

	public void addReservationList(ListReservation obj) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		/*
		 * String
		 * sql="insert into reserve(ticket_no,bus_no,pas_id,no_of_ticket,journy_date) values(ticket_no.nextval,?,?,?,?)"
		 * ; Connection con = TestConnections.getConnection(); System.out.println(sql);
		 * PreparedStatement pst=con.prepareStatement(sql);
		 * 
		 * pst.setInt(1,obj.BusNo); pst.setInt(2,obj.PassengerId);
		 * pst.setInt(3,obj.NoOfTicket); LocalDate ld=LocalDate.parse(obj.date); Date
		 * Journydate=Date.valueOf(ld); pst.setDate(4, Journydate); int
		 * row=pst.executeUpdate(); System.out.println(row);
		 */
		CallableStatement stmt = con.prepareCall("{call ticket_booking(?,?,?)}");
		stmt.setInt(1, obj.getBusNo());
		System.out.println(obj.getBusNo());
		stmt.setInt(2, obj.getPassengerId());
		System.out.println(obj.getPassengerId());
		stmt.setInt(3, obj.getNoOfTicket());
		System.out.println(obj.getNoOfTicket());
		// LocalDate ld=LocalDate.parse(obj.date);
		// Date Journydate=Date.valueOf(ld);
		// stmt.setDate(4, Journydate);
		// System.out.println(Journydate);
		boolean b = stmt.execute();
	}

	public void cancelReservationList(int ticketNo) throws Exception {
		String sql = "delete from reserve where ticket_no=" + ticketNo;
		System.out.println(sql);
		Connection con = ConnectionUtil.getConnection();
		Statement stmt = con.createStatement();
		int row = stmt.executeUpdate(sql);
		System.out.println(row);
	}

	public ArrayList<ListReservation> reserveDetails() throws Exception {
		String sql = "select * from reserve";
		System.out.println(sql);
		Connection con = ConnectionUtil.getConnection();
		Statement stmt = con.createStatement();
		ArrayList<ListReservation> List = new ArrayList<ListReservation>();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			ListReservation obj = new ListReservation();
			obj.setTicketNo(rs.getInt("ticket_no"));
			obj.setBusNo(rs.getInt("bus_no"));
			obj.setPassengerId(rs.getInt("pas_id"));
			obj.setNoOfTicket(rs.getInt("no_of_ticket"));
			// obj.Journydate=rs.getDate("journy_date");
			obj.setTotalAmount(rs.getInt("total_amount"));
			List.add(obj);

		}
		return List;
	}

	public void updateNoOfTicket(int ticketNo, int passengerId, int noOfTicket) throws Exception {

		Connection con = ConnectionUtil.getConnection();
		Statement stmt = con.createStatement();
		String sql = "update reserve set no_of_ticket=" + noOfTicket + " where ticket_no= " + ticketNo + " and pas_id="
				+ passengerId + "";
		System.out.println(sql);
		int row1 = stmt.executeUpdate(sql);
		String sql1 = "select bus_no from reserve where ticket_no=" + ticketNo;
		ResultSet rs = stmt.executeQuery(sql1);
		rs.next();
		int busid = rs.getInt("bus_no");
		String sql2 = "update seat_availability set available_seats= available_seats-" + noOfTicket + "where bus_no="
				+ busid;
		int row = stmt.executeUpdate(sql2);
		String sql3 = "update reserve set total_amount = (" + noOfTicket
				+ "*(select amount from bus_time where bus_no=?))where bus_no=? and pas_id=?";
		PreparedStatement pst = con.prepareStatement(sql3);
		pst.setInt(1, busid);
		pst.setInt(2, busid);
		pst.setInt(3, passengerId);
		System.out.println(sql3);
		int row2 = pst.executeUpdate();
		System.out.println(row);
		System.out.println(row1);
		System.out.println(row2);

	}
}