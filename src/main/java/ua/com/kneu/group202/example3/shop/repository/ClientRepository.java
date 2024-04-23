package ua.com.kneu.group202.example3.shop.repository;

import ua.com.kneu.group202.example3.shop.dao.ClientDao;
import ua.com.kneu.group202.example3.shop.entity.Client;

import java.util.List;

public class ClientRepository implements ClientDao {
    @Override
    public List<Client> findAll() {
        return null;
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
