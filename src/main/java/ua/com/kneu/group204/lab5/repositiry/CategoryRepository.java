package ua.com.kneu.group204.lab5.repositiry;

import jakarta.persistence.EntityManagerFactory;
import ua.com.kneu.group204.lab5.dao.CategoryDao;
import ua.com.kneu.group204.lab5.entity.Category;

import java.util.List;

public class CategoryRepository implements CategoryDao {

    private EntityManagerFactory session;

    public CategoryRepository(EntityManagerFactory session) {
        this.session = session;
    }

    @Override
    public List<Category> findAll() {


        return List.of();
    }

    @Override
    public Category findByName(String name) {
        return null;
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(Category category) {

    }

    @Override
    public void deleteAll() {

    }
}
