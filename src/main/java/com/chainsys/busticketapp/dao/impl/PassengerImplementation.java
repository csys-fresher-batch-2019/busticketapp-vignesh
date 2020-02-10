package com.chainsys.busticketapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.busticketapp.dao.PassengerDAO;
import com.chainsys.busticketapp.model.Passenger;
import com.chainsys.busticketapp.util.ConnectionUtil;

public class PassengerImplementation implements PassengerDAO {

	public void addPassengerlist(Passenger obj)throws Exception {
		String sql = "insert into passenger (pas_id,pas_name,pas_age,pas_gender,pas_contact)values (pas_id.nextval,?,?,?,?)";
		System.out.println(sql);
		try (Connection con = ConnectionUtil.getConnection(); PreparedStatement pst = con.prepareStatement(sql);) {
			pst.setString(1, obj.getPassengerName());
			pst.setInt(2, obj.getPassengerAge());
			pst.setString(3, obj.getPassengerGender());
			pst.setLong(4, obj.getPassengerContact());
			int row = pst.executeUpdate();
			System.out.println(row);
		}
		catch(SQLException e) {
			throw new Exception("Unable to execute insert query");
		}
	}
	public void deletePassengerlist(int passengerId) throws Exception {

		String sql = "delete from passenger where pas_id=?";
		System.out.println(sql);
		try (Connection con = ConnectionUtil.getConnection(); PreparedStatement pst = con.prepareStatement(sql);) {
			pst.setInt(1,passengerId);
			int row = pst.executeUpdate();
		System.out.println(row);
	}
		catch(SQLException e) {
			throw new Exception("Unable to execute delete query");
		}
	}
	public void updatePassengerlist(long passengerContact, int passengerId) throws Exception {

		String sql = "update passenger set pas_contact=? where pas_id=?";
		System.out.println(sql);
		try (Connection con = ConnectionUtil.getConnection(); PreparedStatement pst = con.prepareStatement(sql);) {
			pst.setInt(1,passengerId);
			int row = pst.executeUpdate();
		System.out.println(row);
	}
		catch(SQLException e) {
			throw new Exception("Unable to execute query");
		}
	}

}
