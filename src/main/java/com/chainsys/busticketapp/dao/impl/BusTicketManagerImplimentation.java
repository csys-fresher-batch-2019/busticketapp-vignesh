package com.chainsys.busticketapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.chainsys.busticketapp.DBException;
import com.chainsys.busticketapp.ErrorMessages;
import com.chainsys.busticketapp.dao.BusTicketDAO;
import com.chainsys.busticketapp.model.ListOfBuses;
import com.chainsys.busticketapp.util.ConnectionUtil;

public class BusTicketManagerImplimentation implements BusTicketDAO {
	private int busCount;

	public int getBusCount() {
		return busCount;
	}


	public void setBusCount(int busCount) {
		this.busCount = busCount;
	}


	public void addBuslist(int busNo, String busName, String busSource, String busDestination, String clazz)
			throws Exception {
		String sql = "insert into bus_list (bus_no,bus_name,bus_source,bus_destination,class)values(?,?,?,?,?)";

		try (Connection con = ConnectionUtil.getConnection(); PreparedStatement pst = con.prepareStatement(sql);) {
	
		System.out.println(sql);

			pst.setInt(1, busNo);
			pst.setString(2, busName);
			pst.setString(3, busSource);
			pst.setString(4, busDestination);
			pst.setString(5, clazz);
			int row = pst.executeUpdate();
			System.out.println(row);

		} catch (Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
		}
	

	public void deleteBuslist(int busNo) throws Exception {
		String sql1 = "delete from seat_availability where bus_no=?";
		try (Connection con = ConnectionUtil.getConnection(); PreparedStatement pst = con.prepareStatement(sql1);) {
			pst.setInt(1, busNo);
			pst.executeUpdate();
		}
		String sql = "delete from bus_list where bus_no=?";
		try (Connection con = ConnectionUtil.getConnection(); PreparedStatement pst = con.prepareStatement(sql);) {
			pst.setInt(1, busNo);
			pst.executeUpdate();
			// System.out.println(sql);
			// Statement stmt=con.createStatement();
			// int row=stmt.executeUpdate(sql);
			// System.out.println(row);

			// PreparedStatement pst1=con.prepareStatement(sql1);
			// pst1.setInt(1, BusNo);
			// pst1.executeUpdate();
			// Statement stmt1=con.createStatement();
			System.out.println(busNo + " Bus Details are delete successfully");
		}catch (Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
	}

	public int noOfBuses() throws Exception {
		String sql = "select count(*) as busCount  from bus_list";
		System.out.println(sql);
		
		try (Connection con = ConnectionUtil.getConnection(); Statement stmt = con.createStatement();ResultSet rs = stmt.executeQuery(sql);){
		
			if (rs.next()) {
			 busCount = rs.getInt("busCount");
		}
		}
		catch (Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
		
		return busCount;
		
	}

	public HashMap<String, Integer> noOfBuslist() throws Exception {
		String sql = "select bus_name,bus_no from bus_list";
		System.out.println(sql);
		HashMap<String, Integer> obj = new HashMap<String, Integer>();
		try (Connection con = ConnectionUtil.getConnection(); Statement stmt = con.createStatement();) {
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				// System.out.println(""+rs.getString("bus_name"));
				String busName = rs.getString("bus_name");
				int busNo = rs.getInt("bus_no");
				obj.put(busName, busNo);
			}

		} catch (Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
		return obj;
	}

	public List<ListOfBuses> sourceStationlist(String busSource, String busDestination) throws Exception {
		String sql = "select *from bus_list where bus_source=? and bus_destination=?";
		List<ListOfBuses> source = new ArrayList<>();
		try (Connection con = ConnectionUtil.getConnection();
				PreparedStatement pst=con.prepareStatement(sql);){
			pst.setString(1, busSource);
			pst.setString(2, busDestination);
			try(ResultSet rs = pst.executeQuery();) {
			// System.out.println("BusNo:\tSource:\tDestination\tBusName:\tClass:");
			while (rs.next()) {
				ListOfBuses p = new ListOfBuses();
				p.setBusNo(rs.getInt("bus_no"));
				p.setBusName(rs.getString("bus_name"));
				p.setBusSource(rs.getString("bus_source"));
				p.setBusDestination(rs.getString("bus_destination"));
				p.setClazz(rs.getString("class"));
				source.add(p);
			}
				}
		
		}catch (Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}

		return source;
	}

}
