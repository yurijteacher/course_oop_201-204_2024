package ua.com.kneu.group201.lab3.flyweight;

public interface Drive {
    Object getConnection(String url, String username, String password);
    void execute(String sql);
    void executeUpdate(String sql);

}
