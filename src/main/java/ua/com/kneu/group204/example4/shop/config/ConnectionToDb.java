package ua.com.kneu.group204.example4.shop.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDb {
    private final static String url = "jdbc:mysql://localhost:3306/course_ooap_2024_204";
    private final static String username = "root";
    private final static String password = "root1234";
    Connection connection = null;

    public Connection getConnection(){

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return connection;
    }


}
