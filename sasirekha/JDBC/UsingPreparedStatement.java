package com.company.loginPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsingPreparedStatement {
    public static void main(String[] args) throws SQLException {
        final String query = "INSERT INTO employee(EmpID,FirstName,SecondName,MobileNumber,EmailId,Password )" +
                " VALUES(?,?,?,?,?,?);";
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","mysql")) {
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setInt(1,15);
            statement.setString(2,"Ramesh");
            statement.setString(3,"Sharma");
            statement.setString(4,"94892429401");
            statement.setString(5,"fhskfsk@gmail.com");
            statement.setString(6,"hfiowhfiowhf");
            System.out.println(statement);
            statement.executeUpdate();



        }
    }
}
