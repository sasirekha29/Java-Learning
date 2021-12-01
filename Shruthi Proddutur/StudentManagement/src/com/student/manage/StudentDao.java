package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;;

public class StudentDao {
	public static boolean insertStudentToDB(Student student) {
		boolean f = false;
		// jdbc code .. 
		try {
			String user = "root";
			String password = "pluralsight";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			//Connection con = connection.createConnection();
			String q = "insert into student(sname, phone, scity) values(?,?,?)";
			//prepared Statement
			PreparedStatement pstmt = con.prepareStatement(q);
			// setting the values of parameters
			pstmt.setString(1, student.getStudentName());
			pstmt.setString(2, student.getStudentPhone());
			pstmt.setString(3, student.getStudentCity());
			
			//execute
			pstmt.executeUpdate();
			f = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static boolean deleteStudent(int sid) {
		// TODO Auto-generated method stub
		boolean f = false;
		// jdbc code .. 
		try {
			String user = "root";
			String password = "pluralsight";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			//Connection con = connection.createConnection();
			String q = "delete from student where sid = ?";
			//prepared Statement
			PreparedStatement pstmt = con.prepareStatement(q);
			// setting the values of parameters
			pstmt.setInt(1, sid);
			
			
			//execute
			pstmt.executeUpdate();
			f = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
		
	}

	public static void displayStudent() {
		// TODO Auto-generated method stub
		//boolean f = false;
		// jdbc code .. 
		try {
			String user = "root";
			String password = "pluralsight";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			//Connection con = connection.createConnection();
			String q = "select * from student";
			
			Statement stmt = con.createStatement();
			stmt.executeQuery(q);
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next()) {
				int id  = set.getInt(1);
				String name = set.getString(1);
				String phone = set.getString(3);
				String city = set.getString("scity");
				
				System.out.println("++++++++++++++++++++++");
				System.out.println("ID: " + id);
				System.out.println("Name: " + name);
				System.out.println("Phone: " + phone);
				System.out.println("City: " + city);
				System.out.println("++++++++++++++++++++++");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void displayParticularStudent(int sid) {
		// TODO Auto-generated method stub
		//boolean f = false;
		// jdbc code .. 
		try {
			String user = "root";
			String password = "pluralsight";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			//creating a statement obj
			Statement smt = con.createStatement();
			//query to display a particular record
			String q = "Select * from student where sid = '"+ sid +"'";
			//retrieving data
			ResultSet rs = smt.executeQuery(q);
			
			if(rs.next()) {
				System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
			} else {
				System.out.println("Record not found :(");
				
			}
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
