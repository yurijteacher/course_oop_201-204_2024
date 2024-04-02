package ua.com.kneu.group201.lab3.structural.flyweight;

public class JdbcDriverDb2 implements Drive {
    @Override
    public Object getConnection(String url, String username, String password) {
        return "connection to Db2";
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
