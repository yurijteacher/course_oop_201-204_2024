package ua.com.kneu.group204.example4.shop.repository;

import ua.com.kneu.group204.example4.shop.config.ConnectionToDb;
import ua.com.kneu.group204.example4.shop.dao.ClientDao;
import ua.com.kneu.group204.example4.shop.entity.Clients;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository extends ConnectionToDb implements ClientDao {

    Connection connection;

    public ClientRepository() {
        this.connection = getConnection();
    }


    @Override
    public List<Clients> findAll() {

        List<Clients> clients = new ArrayList<>();

        String sql = "{call findAllClient()}";
        try {
            CallableStatement cs = connection.prepareCall(sql);
            ResultSet rs = cs.executeQuery();

            while (rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");

                clients.add(new Clients(id, name, lastName, email, phone));

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return clients;
    }

    @Override
    public Clients findById(Long id) {
        return null;
    }

    @Override
    public void save(Clients obj) {

    }

    @Override
    public void update(Clients obj) {

    }

    @Override
    public void deleteById(Clients obj) {

    }

    @Override
    public void deleteAll() {

    }
}
