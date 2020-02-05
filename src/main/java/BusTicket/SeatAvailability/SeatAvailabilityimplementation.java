package BusTicket.SeatAvailability;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import BusTicket.TestConnections;

public class SeatAvailabilityimplementation implements SeatAvailabilityManager {
	public void addAvailableSeatlist(SeatAvailability obj) throws Exception{
		String sql="insert into seat_availability(bus_no,available_seats,total_seats) values(?,?,?)";
		Connection con = TestConnections.getConnection();
		System.out.println(sql);
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, obj.getBusNo());
		pst.setInt(2, obj.getAvailableSeats());
		pst.setInt(3, obj.TotalSeats);
		int row=pst.executeUpdate();
		System.out.println(row);
	}
	public void deleteAvailableSeatlist(int BusNo) throws Exception{
		String sql="delete from seat_availability where bus_no="+BusNo;
		Connection con = TestConnections.getConnection();
		//System.out.println(sql);
		Statement stmt=con.createStatement();
		int row=stmt.executeUpdate(sql);
		System.out.println(row);
	}
	public void updateAvailableSeatlist(int AvailableSeats,int BusNo) throws Exception{
		String sql="update seat_availability set available_seats="+AvailableSeats+" where bus_no= "+BusNo+"";
		System.out.println(sql);
		Connection con = TestConnections.getConnection();
		Statement stmt=con.createStatement();
		int row=stmt.executeUpdate(sql);
		System.out.println(row);
		
	}
public List<SeatAvailability> AvailableSeatDetails(SeatAvailability obj) throws Exception{
	 String sql="select *from seat_availability where bus_no="+obj.getBusNo();
	 System.out.println(sql);
	 Connection con = TestConnections.getConnection();
	 Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		List<SeatAvailability> available = new ArrayList<SeatAvailability>();
		  while(rs.next()) {
			SeatAvailability p= new SeatAvailability();
			p.setBusNo(rs.getInt("bus_no"));
			p.setAvailableSeats(rs.getInt("available_seats"));
			available.add(p);
		}
	return available;
	
}

	

}
