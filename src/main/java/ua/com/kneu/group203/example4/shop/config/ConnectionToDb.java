package ua.com.kneu.group203.example4.shop.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDb {

    private  final String username = "root";
    private final String password = "root1234";
    private final String url = "jdbc:mysql://localhost:3306/course_ooap_2024_203";
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
