package busticket.bustiming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.busticketapp.dao.TimingDAO;
import com.chainsys.busticketapp.model.ListBusTiming;
import com.chainsys.busticketapp.util.ConnectionUtil;

public class BusTimingIplementation implements TimingDAO{
	public void addBusTiming(ListBusTiming obj) throws Exception {
		String sql="insert into bus_time(bus_no,amount,departure_time,arraival_time) values(?,?,?,?)";
		Connection con = ConnectionUtil.getConnection();
		System.out.println(sql);
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1,obj.getBusNo());
		pst.setInt(2, obj.getAmount());
		//pst.setTimestamp(3,java.sql.Timestamp.valueOf(obj.departureTime));
		//pst.setTimestamp(4,java.sql.Timestamp.valueOf(obj.arrivalTime));
		pst.setString(3, obj.getDepartureTime());
		pst.setString(4, obj.getArrivalTime());
		int row=pst.executeUpdate();
		System.out.println(row);
	}
	public void deleteBusTiming(int BusNo) throws Exception{
		String sql="delete from bus_time where bus_no="+BusNo;
		System.out.println(sql);
		Connection con = ConnectionUtil.getConnection();
		Statement stmt=con.createStatement();
		int row=stmt.executeUpdate(sql);
		System.out.println(row);		
	}
	public List<ListBusTiming> BustimeDetails() throws Exception{
		String sql="select * from bus_time";
		System.out.println(sql);
		Connection con = ConnectionUtil.getConnection();
		Statement stmt=con.createStatement();
		ArrayList<ListBusTiming> List=new ArrayList<ListBusTiming>();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			ListBusTiming obj = new ListBusTiming();
			obj.setBusNo(rs.getInt("bus_no"));
			obj.setAmount(rs.getInt("amount"));
			obj.setDepartureTime(rs.getString("departure_time"));
			obj.setArrivalTime(rs.getString("arraival_time"));
			List.add(obj);
			
				}
		return List;
		
	}
		

}
