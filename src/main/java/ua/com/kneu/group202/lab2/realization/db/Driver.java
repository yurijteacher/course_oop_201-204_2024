package ua.com.kneu.group202.lab2.realization.db;

public interface Driver {

    Object getConnection(String url, String username, String pass);
    void  execute(String sql);


}
