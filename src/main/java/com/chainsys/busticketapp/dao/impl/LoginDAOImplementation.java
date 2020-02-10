package com.chainsys.busticketapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.busticketapp.DBException;
import com.chainsys.busticketapp.ErrorMessages;
import com.chainsys.busticketapp.dao.LoginDAO;
import com.chainsys.busticketapp.util.ConnectionUtil;

public class LoginDAOImplementation implements LoginDAO {
	public boolean adminLogin(String adminname, String pass) throws Exception {

		boolean valid = false;
		String sql = "select Admin_name from AdminRegister where Admin_name=? and pass_word = ?";
		try (Connection con = ConnectionUtil.getConnection(); 
				PreparedStatement pst = con.prepareStatement(sql)) {

			pst.setString(1, adminname);
			pst.setString(2, pass);

			try (ResultSet rs = pst.executeQuery()) {
				if (rs.next()) {
					valid = true;
				}
			}
		catch(SQLException e) {
			throw new Exception("Unable to execute login query");
		}
		}
		catch (Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
		return valid;
	}
	// user Login

	public boolean user(String userName, String password) throws Exception {
		boolean valid = false;
		String sql="select name from UserRegister where name=? and password=?";
		try (Connection con = ConnectionUtil.getConnection(); 
				PreparedStatement pst = con.prepareStatement(sql)) {
			
			pst.setString(1, userName);
			pst.setString(2, password);
			
			try(ResultSet rs = pst.executeQuery()){
				if(rs.next()) {
				valid = true;
				}
			}
		catch(SQLException e) {
			throw new Exception("Unable to execute login query");
		}
		}
		catch (Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
		return valid;
	}
}
