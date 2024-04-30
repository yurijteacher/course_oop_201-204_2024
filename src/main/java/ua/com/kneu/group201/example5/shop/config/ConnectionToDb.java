package ua.com.kneu.group201.example5.shop.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDb {
    private final String url = "jdbc:mysql://localhost:3306/course_ooap_2024_201";
    String username = "root";
    String password = "root1234";


    public Connection getConnection(){

        Connection connection = null;


        try {
            connection = DriverManager.getConnection(url, username, password);

            System.out.println("connection to db");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }


}
