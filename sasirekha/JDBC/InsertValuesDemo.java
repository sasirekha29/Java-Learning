package com.company.loginPage;

import java.sql.*;

/**
 * Description : This class is used to describe about the statement.executeupdate() method.
 * Returns: The number of rows affected or zero when it returns nothing
 * It is used for DDL-> Insert, delete, update  DML -> Create, alter
 * EXCEPTION: When try to use for select statement it throws exception
 */
public class InsertValuesDemo {
    public static void main(String[] args) {
        String query1="INSERT INTO employee(EmpID,FirstName,SecondName,MobileNumber,EmailId,Password )" +
              " VALUES(4,'Rahul','mark','82535359820','nksbssa@gmail.com','wrhi12hr2h');";
        String query2="select * from employee";
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","mysql"))
        {
            Statement statement= connection.createStatement();
            int result=statement.executeUpdate(query1);
            System.out.println("The number of rows affected is "+ result);
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}
