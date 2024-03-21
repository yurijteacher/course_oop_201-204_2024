package ua.com.kneu.group204.lab3.structural.flyweight;

public interface Drive {
    Object getConnection(String url, String username, String password);
    void execute(String sql);
    void executeUpdate(String sql);

}
