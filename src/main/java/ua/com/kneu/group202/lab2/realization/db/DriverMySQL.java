package ua.com.kneu.group202.lab2.realization.db;

public class DriverMySQL implements Driver{
    @Override
    public Object getConnection(String url, String username, String pass) {
        return "connection mysql";
    }

    @Override
    public void execute(String sql) {
        System.out.println(sql);
    }
}
