/** this class is used to validate the credientials entered by the user**/
package com.learn.Login;

public class LoginService {

	public boolean ValidateUser(String username,String password)
	{
		if (username.equalsIgnoreCase("sasi") && password.equalsIgnoreCase("password"))
			return true;
		return false;
	}
}
