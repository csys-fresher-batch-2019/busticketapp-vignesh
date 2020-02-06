package busticket.seatavailability;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.busticketapp.dao.SeatAvailabilityDAO;
import com.chainsys.busticketapp.model.SeatAvailability;
import com.chainsys.busticketapp.util.ConnectionUtil;

public class SeatAvailabilityimplementation implements SeatAvailabilityDAO {
	public void addAvailableSeatlist(SeatAvailability obj) throws Exception{
		String sql="insert into seat_availability(bus_no,available_seats,total_seats) values(?,?,?)";
		Connection con = ConnectionUtil.getConnection();
		System.out.println(sql);
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, obj.getBusNo());
		pst.setInt(2, obj.getAvailableSeats());
		pst.setInt(3, obj.getTotalSeats());
		int row=pst.executeUpdate();
		System.out.println(row);
	}
	public void deleteAvailableSeatlist(int busNo) throws Exception{
		String sql="delete from seat_availability where bus_no="+busNo;
		Connection con = ConnectionUtil.getConnection();
		//System.out.println(sql);
		Statement stmt=con.createStatement();
		int row=stmt.executeUpdate(sql);
		System.out.println(row);
	}
	public void updateAvailableSeatlist(int availableSeats,int busNo) throws Exception{
		String sql="update seat_availability set available_seats="+availableSeats+" where bus_no= "+busNo+"";
		System.out.println(sql);
		Connection con = ConnectionUtil.getConnection();
		Statement stmt=con.createStatement();
		int row=stmt.executeUpdate(sql);
		System.out.println(row);
		
	}
public List<SeatAvailability> availableSeatDetails(SeatAvailability obj) throws Exception{
	 String sql="select *from seat_availability where bus_no="+obj.getBusNo();
	 System.out.println(sql);
	 Connection con = ConnectionUtil.getConnection();
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
