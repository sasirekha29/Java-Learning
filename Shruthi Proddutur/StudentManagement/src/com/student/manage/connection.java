package com.student.manage;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
	
	static Connection con; // connection variable
	
	public static Connection createConnection() {
		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// creating the connection..
			String user = "root";
			String password = "pluralsight";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			
			con = DriverManager.getConnection(url, user, password);
			
			} catch(Exception e) {
				e.printStackTrace();
			}
		return con;
	}
}
	
