package com.company.loginPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * This class is used to insert image into a database
 */
public class InsertimagesintoDatabase {
    public static void main(String[] args) {
        String query = "Insert into Images(Data) Values(?);";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "mysql");
             PreparedStatement statement = connection.prepareStatement(query)) {
            File myfile = new File("src/com/company/loginPage/OIP.jpg");
            try (FileInputStream fin = new FileInputStream(myfile)) {
                statement.setBinaryStream(1, fin, (int) myfile.length());
                statement.executeUpdate();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
