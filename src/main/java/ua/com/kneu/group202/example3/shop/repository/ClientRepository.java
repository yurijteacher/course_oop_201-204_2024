package ua.com.kneu.group202.example3.shop.repository;

import ua.com.kneu.group202.example3.shop.config.ConnectionToDb;
import ua.com.kneu.group202.example3.shop.dao.ClientDao;
import ua.com.kneu.group202.example3.shop.entity.Client;

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
    public List<Client> findAll() {

        List<Client> clients = new ArrayList<>();


        String sql = "{call findClients}";

        try {
            CallableStatement cs = connection.prepareCall(sql);
            ResultSet rs = cs.executeQuery();

            while (rs.next()){

                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");

                Client client = new Client();
                client.setFirstName(firstName);
                client.setLastName(lastName);
                client.setEmail(email);
                client.setPhone(phone);

                clients.add(client);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return clients;
    }

    @Override
    public Client findById(Long id) {
        return null;
    }

    @Override
    public void save(Client obj) {

    }

    @Override
    public void update(Client obj) {

    }

    @Override
    public void delete(Client obj) {

    }

    @Override
    public void deleteAll() {

    }
}
