package ua.com.kneu.group204.example4.shop.repository;

import ua.com.kneu.group204.example4.shop.dao.ProductDao;
import ua.com.kneu.group204.example4.shop.entity.Product;

import java.util.List;

public class ProductRepository implements ProductDao {

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public void save(Product obj) {

    }

    @Override
    public void update(Product obj) {

    }

    @Override
    public void deleteById(Product obj) {

    }

    @Override
    public void deleteAll() {

    }
}
