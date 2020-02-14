package com.chainsys.busticketapp.dao;

public interface LoginDAO {
	
	public boolean adminLogin(String adminname, String pass) throws Exception;
	
	public boolean user(String emailId, String pass) throws Exception ;
}
