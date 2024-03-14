package ua.com.kneu.group203.lab2.my_interface.db;

public class DriverMySQL implements DriverDB{
    @Override
    public Object getConnection(String url, String username, String password) {
        return "connection to DB MySQL";
    }
}
