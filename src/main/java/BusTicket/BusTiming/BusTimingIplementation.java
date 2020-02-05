package BusTicket.BusTiming;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

import BusTicket.TestConnections;

public class BusTimingIplementation implements TimingManager{
	public void addBusTiming(ListBusTiming obj) throws Exception {
		String sql="insert into bus_time(bus_no,amount,departure_time,arraival_time) values(?,?,?,?)";
		Connection con = TestConnections.getConnection();
		System.out.println(sql);
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1,obj.BusNo);
		pst.setInt(2, obj.amount);
		//pst.setTimestamp(3,java.sql.Timestamp.valueOf(obj.departureTime));
		//pst.setTimestamp(4,java.sql.Timestamp.valueOf(obj.arrivalTime));
		pst.setString(3, obj.departureTime);
		pst.setString(4, obj.arrivalTime);
		int row=pst.executeUpdate();
		System.out.println(row);
	}
	public void deleteBusTiming(int BusNo) throws Exception{
		String sql="delete from bus_time where bus_no="+BusNo;
		System.out.println(sql);
		Connection con = TestConnections.getConnection();
		Statement stmt=con.createStatement();
		int row=stmt.executeUpdate(sql);
		System.out.println(row);		
	}
	
		

}
