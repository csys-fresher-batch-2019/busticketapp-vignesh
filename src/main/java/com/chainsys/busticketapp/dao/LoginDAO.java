package com.chainsys.busticketapp.dao;

public interface LoginDAO {
	public boolean AdminLogin(String Adminname, String pass) throws Exception;
	public boolean user(String name, String pass) throws Exception ;
}
