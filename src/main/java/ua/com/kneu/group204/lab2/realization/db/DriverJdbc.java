package ua.com.kneu.group204.lab2.realization.db;

public interface DriverJdbc {

    Object getConnection(String url, String username, String password);
    void execute(String sql);

}
