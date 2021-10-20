package com.company.loginPage;

import java.sql.*;

/**
 * Description: This class is used to demonstrate the statement.executequery() process
 * Returns: Resultset Object
 * This is used when we use select statement mostly (Data query language alone is used).
 */

public class ExecuteQueryDemo {
    public static void main(String[] args) {
        String query1="select * from employee";
        //String query2="INSERT INTO employee(EmpID,FirstName,SecondName,MobileNumber,EmailId,Password )" +
        //       " VALUES(4,'Rahul','mark','82535359820','nksbssa@gmail.com','wrhi12hr2h');";
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","mysql"))
        {
            // when the resultset is default
            //Statement statement= connection.createStatement();
            // when the resultset has to be updated and also the cursor can move forward and backward
            Statement statement= connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet= statement.executeQuery(query1);
            resultSet.relative(2);
            while (resultSet.next())

            {
                System.out.println(resultSet.getInt("EmpID")+" "+resultSet.getString("FirstName")
                +" "+ resultSet.getString("SecondName")+ resultSet.getString("MobileNumber")+
                        " "+ resultSet.getString("EmailId")+" "+ resultSet.getString("Password"));

            }


        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}
