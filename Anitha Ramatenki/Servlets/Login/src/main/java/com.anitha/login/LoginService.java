package com.anitha.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("Anitha") && password.equals("anu"))
			return true;

		return false;
	}

}