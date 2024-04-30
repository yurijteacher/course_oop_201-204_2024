package ua.com.kneu.group204.lab5.repositiry;

import jakarta.persistence.EntityManagerFactory;
import ua.com.kneu.group204.lab5.dao.ProductDao;
import ua.com.kneu.group204.lab5.entity.Product;

import java.util.List;

public class ProductRepository implements ProductDao {

    private final EntityManagerFactory session;

    public ProductRepository(EntityManagerFactory session) {
        this.session =session;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Product findByName(String name) {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void deleteAll() {

    }
}
