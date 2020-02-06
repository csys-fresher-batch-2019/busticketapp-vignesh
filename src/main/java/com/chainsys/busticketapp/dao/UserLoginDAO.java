package com.chainsys.busticketapp.dao;

import com.chainsys.busticketapp.model.UserLogin;

public interface UserLoginDAO {
	public void newUserRegister(UserLogin obj) throws Exception;

	public void removeUser(int userId) throws Exception;
}
