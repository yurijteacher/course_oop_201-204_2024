package ua.com.kneu.group203.lab3.structural.flyweight;

public class JdbcDriverPostgres implements Drive {
    @Override
    public Object getConnection(String url, String username, String password) {
        return "connection to Postgres";
    }

    @Override
    public void execute(String sql) {
        System.out.println(sql);
    }

    @Override
    public void executeUpdate(String sql) {
        System.out.println("update:" + sql);
    }
}
