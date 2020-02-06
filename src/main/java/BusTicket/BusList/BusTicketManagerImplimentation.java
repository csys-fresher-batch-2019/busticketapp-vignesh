package busticket.buslist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.chainsys.busticketapp.dao.BusTicketDAO;
import com.chainsys.busticketapp.model.ListOfBuses;
import com.chainsys.busticketapp.util.ConnectionUtil;

public class BusTicketManagerImplimentation implements BusTicketDAO {

	public void addBuslist(int BusNo, String BusName, String BusSource, String BusDestination, String Class) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		//String sql="insert into bus_list (bus_no,bus_name,bus_source,bus_destination,class)values+ (?,?,?,?,?)";//prepared statement needed
		String sql="insert into bus_list (bus_no,bus_name,bus_source,bus_destination,class)values ("+BusNo+",'"+BusName+"','"+BusSource+"','"+BusDestination+"','"+Class+"')";
		System.out.println(sql);
		Statement stmt=con.createStatement();
		int row=stmt.executeUpdate(sql);
		System.out.println(row);
	
	
	}
	public void deleteBuslist(int BusNo) throws Exception {
		Connection con = ConnectionUtil.getConnection();
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
	 public int noOfBuses() throws Exception {
		 String sql="select count(*) as busCount  from bus_list"; 
		 System.out.println(sql);
		 Connection con = ConnectionUtil.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			rs.next();
			//System.out.println(""+rs.getInt("busCount"));	
			return rs.getInt("busCount");
		 
	}
	 public HashMap<String,Integer> noOfBuslist() throws Exception{
		 String sql="select bus_name,bus_no from bus_list";
		 System.out.println(sql);
		 Connection con = ConnectionUtil.getConnection();
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
	 public List<ListOfBuses> sourceStationlist(String BusSource,String BusDestination) throws Exception {
		 String sql="select *from bus_list where bus_source='"+BusSource+"' and bus_destination='"+BusDestination+"'";
		 //System.out.println(sql);
		 System.out.println("BusNo:\tSource:\tDestination\tBusName:\tClass:");
		 Connection con = ConnectionUtil.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			List<ListOfBuses> source= new ArrayList<ListOfBuses>();
			while(rs.next()) {
				ListOfBuses p = new ListOfBuses();
				p.setBusNo(rs.getInt("bus_no"));
				p.setBusName(rs.getString("bus_name"));
				p.setBusSource(rs.getString("bus_source"));
				p.setBusDestination(rs.getString("bus_destination"));
				p.setClazz(rs.getString("class"));
				source.add(p);
				
			}
		 return source;
	 }
	
}
