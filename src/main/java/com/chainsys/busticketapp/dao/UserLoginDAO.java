package com.chainsys.busticketapp.dao;

import com.chainsys.busticketapp.model.UserLogin;

public interface UserLoginDAO {
	public void NewUserRegister(UserLogin obj) throws Exception;

	public void RemoveUser(int UserId) throws Exception;
}
