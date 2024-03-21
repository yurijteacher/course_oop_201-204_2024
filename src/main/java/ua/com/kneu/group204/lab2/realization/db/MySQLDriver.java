package ua.com.kneu.group204.lab2.realization.db;

public class MySQLDriver implements DriverJdbc{
    @Override
    public Object getConnection(String url, String username, String password) {

        System.out.println("get connection to MySQL");
        return "get connection to MySQL";
    }

    @Override
    public void execute(String sql) {
        System.out.println(sql);
    }
}
