package ua.com.kneu.group204.lab2.realization.db;

public class PostgresDriver implements DriverJdbc{
    @Override
    public Object getConnection(String url, String username, String password) {
        System.out.println("get connection to Postgres");
        return "get connection to Postgres";
    }

    @Override
    public void execute(String sql) {
        System.out.println(sql);
    }
}
