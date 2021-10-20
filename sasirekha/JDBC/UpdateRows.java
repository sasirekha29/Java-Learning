package com.company.loginPage;

import java.sql.*;

public class UpdateRows {
    public static void main(String[] args) throws SQLException {
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "mysql");

        try(Statement statement= connect.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE))
        {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
            while (resultSet.next())
            {
                String SName = resultSet.getString("SecondName");
                if (SName.equals("malik"))
                {
                    resultSet.updateString("SecondName", SName + "Sharma");
                    resultSet.updateRow();
                }
            }
        }
    }
}
