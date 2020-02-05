package com.chainsys.busticketapp.model;

public class UserLogin {
	public String UserName;
	public String EmailId;
	public String password;
	public Long contactNumber;
	public int UserId;

	@Override
	public String toString() {
		return "UserLogin [UserName=" + UserName + ", EmailId=" + EmailId + ", password=" + password
				+ ", contactNumber=" + contactNumber + ", UserId=" + UserId + "]";
	}

}
