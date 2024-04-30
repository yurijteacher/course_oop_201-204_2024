package ua.com.kneu.group201.example5.shop.repository;

import ua.com.kneu.group201.example5.shop.config.ConnectionToDb;
import ua.com.kneu.group201.example5.shop.dao.UserDao;
import ua.com.kneu.group201.example5.shop.entity.Users;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserRepository extends ConnectionToDb implements UserDao {


    Connection connection;

    public UserRepository() {
        this.connection = getConnection();
    }

    @Override
    public List<Users> findAll() {

        List<Users> users = new ArrayList<>();

        String sql = "{call findAllUsers()}";

        try {
            CallableStatement cs = connection.prepareCall(sql);

            ResultSet rs = cs.executeQuery();

            while (rs.next()){
            Long id = rs.getLong("id");
            String user = rs.getString("username");
            String pass =rs.getString("password");

            users.add(new Users(id,user,pass));
            }

            rs.close();
            cs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return users;
    }

    @Override
    public Users findById(Long id) {
        return null;
    }

    @Override
    public Users findByName(String name) {
        return null;
    }

    @Override
    public void save(Users obj) {

    }

    @Override
    public void update(Users obj) {

    }

    @Override
    public void deleteByObj(Users obj) {

    }

    @Override
    public void deleteAll() {

    }
}
