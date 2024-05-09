package ua.com.kneu.group204.lab5.config;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import ua.com.kneu.group204.lab5.dao.CategoryDao;
import ua.com.kneu.group204.lab5.dao.ProductDao;
import ua.com.kneu.group204.lab5.repositiry.CategoryRepository;
import ua.com.kneu.group204.lab5.repositiry.ProductRepository;

public class Factory {

    public static Factory INSTANCE = new Factory();

    public static Factory getINSTANCE() {
        return INSTANCE;
    }

    private final EntityManagerFactory session;

    public Factory() {
        this.session = Persistence.createEntityManagerFactory("example");
    }

    public CategoryDao getCategoryDao() {
        return new CategoryRepository(session);
    }

    public ProductDao getProductDao() {
        return new ProductRepository(session);
    }



}
