package ua.com.kneu.group202.example3.shop.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDb {

    private final static String username = "root";
    private final static String password = "root1234";
    private final static String url = "jdbc:mysql://localhost:3306/course_ooap_2024_202";

    public Connection getConnection(){

        Connection connection = null;


        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection To DB");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }


}
