package com.company.loginPage;
import java.sql.*;

/** Description: This class is used to demonstrate the statement.execute() method
 * Returns : Boolean whether the resulting query returns the resultset object or not
 * Usuage: It is used to execute all queries. If it is true: the resultset object can be obtained from statement.getResultset()
 * and further process can be done using that
 */
public class Driver {
    public static void main(String[] args) throws SQLException {
        //To establish a connection
        // String query1="INSERT INTO employee(EmpID,FirstName,SecondName,MobileNumber,EmailId,Password )" +
        //        " VALUES(3,'Ramesh','mark','8428209490','shrwkf@gmail.com','13791sbfjs');";
        String query2;
        query2 = "SELECT * FROM employee;";
        try (Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "mysql")) {

            // to execute the statements
            Statement statement = connect.createStatement();

            // using execute
            //boolean hasresultset = statement.execute(query1);
            boolean hasresultset = statement.execute(query2);
            if (hasresultset)
            {
                ResultSet resultSet = statement.getResultSet();
                ResultSetMetaData rsmd = resultSet.getMetaData();
                int numberofcolumns=rsmd.getColumnCount();
                while(resultSet.next())
                {
                    for(int i=0;i<numberofcolumns;i++)
                    {
                        System.out.print(resultSet.getString(i+1)+" ");
                    }
                    System.out.println("\n");
                }
            }
            else {
                System.out.println("The records affected by this SQL statement are "+ statement.getUpdateCount());
            }

        }
    }
}