package com.Rohini.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("ROHINI") && password.equals("rohini"))
			return true;

		return false;
	}

}