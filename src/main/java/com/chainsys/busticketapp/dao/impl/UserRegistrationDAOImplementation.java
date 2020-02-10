package com.chainsys.busticketapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.busticketapp.dao.UserRegistrationDAO;
import com.chainsys.busticketapp.model.UserRegistration;
import com.chainsys.busticketapp.util.ConnectionUtil;

public class UserRegistrationDAOImplementation implements UserRegistrationDAO {
	UserRegistration obj = new UserRegistration();

	public void newUserRegister(UserRegistration obj) throws Exception {
		String sql = "insert into UserRegister(name,Email_id,password,contact,user_id) values(?,?,?,?,?)";
		System.out.println(sql);
		try(Connection con = ConnectionUtil.getConnection();
				PreparedStatement pst = con.prepareStatement(sql);){
		pst.setString(1, obj.getUserName());
		pst.setString(2, obj.getEmailId());
		pst.setString(3, obj.getPassword());
		pst.setLong(4, obj.getContactNumber());
		pst.setInt(5, obj.getUserId());
		int row = pst.executeUpdate();
		System.out.println(row);
		}
		catch(SQLException e) {
			throw new Exception("Unable to execute login query");
		}
	}

	public void removeUser(int userId) throws Exception {
		String sql = "delete from UserRegister where user_id=?";
		try(Connection con = ConnectionUtil.getConnection();
				PreparedStatement pst = con.prepareStatement(sql);){
			pst.setInt(1, userId);
			int row = pst.executeUpdate();
		System.out.println(row);

	}
		catch(SQLException e) {
			throw new Exception("Unable to execute login query");
		}
	}
}
