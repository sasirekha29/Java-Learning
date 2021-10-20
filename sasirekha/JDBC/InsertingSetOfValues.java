package com.company.loginPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingSetOfValues {
    public static void main(String[] args) throws SQLException {
        String query1,query2,query3,query4;
        query1="INSERT INTO employee(EmpID,FirstName,SecondName,MobileNumber,EmailId,Password )VALUES(5,'Raki','malik','84692846912','snklasnf@gmail.com','afnlaf');";
        query2="INSERT INTO employee(EmpID,FirstName,SecondName,MobileNumber,EmailId,Password )VALUES(6,'Rahu','malik','82492794027','andkand@gmail.com','vnslfnksf13');";
        query3="INSERT INTO employee(EmpID,FirstName,SecondName,MobileNumber,EmailId,Password )VALUES(7,'Rema','malik','92478124142','andkland@gmail.com','anejr2u93');";
        query4="INSERT INTO employee(EmpID,FirstName,SecondName,MobileNumber,EmailId,Password )VALUES(8,'Ramu','malik','91458148113','nsfklqnq@gmail.com','4710974nkdn');";

        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "mysql");
        try(Statement statement = connect.createStatement())
        {
            connect.setAutoCommit(false);
            statement.addBatch(query1);
            statement.addBatch(query2);
            statement.addBatch(query3);
            statement.addBatch(query4);
            int[] updateCounts = statement.executeBatch();
            connect.commit();
        }

    }
}
