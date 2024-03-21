package ua.com.kneu.lecture3.creational.factory;

public interface Drive {
    Object getConnection(String url, String username, String password);
    void execute(String sql);
    void executeUpdate(String sql);

}
