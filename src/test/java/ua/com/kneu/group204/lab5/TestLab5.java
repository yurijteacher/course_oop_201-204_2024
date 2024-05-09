package ua.com.kneu.group204.lab5;

import org.junit.Test;
import ua.com.kneu.group204.lab5.config.Factory;
import ua.com.kneu.group204.lab5.dao.CategoryDao;
import ua.com.kneu.group204.lab5.dao.ProductDao;
import ua.com.kneu.group204.lab5.entity.Category;
import ua.com.kneu.group204.lab5.entity.Product;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class TestLab5 {

    private Factory factory = Factory.getINSTANCE();

    public int sum(int a, int b) {
        return a + b;
    }

    @Test
    public void Test(){

        int a = 3;
        int b = 4;

        // int sum = a + b;
        int c = sum(a, b);

        assertEquals(7,c);


        CategoryDao categoryDao = factory.getCategoryDao();

        Category category = new Category();
        category.setName("air");
        category.setDescription("asd asd as d");
        category.setImage("images/image/1.jpg");

        categoryDao.save(category);


        List<Category> categories = categoryDao.findAll();
        assertEquals(1,categories.size());

        Category category1 = categoryDao.findById(1L);
        assertEquals("air",category1.getName());

        category1.setName("pro");

        categoryDao.update(category1);

        categories = categoryDao.findAll();
            assertEquals("pro",categories.get(0).getName());

          //  categoryDao.delete(category1);
          //  assertEquals(0,categoryDao.findAll().size());


        ProductDao productDao = factory.getProductDao();

        Product product = new Product();
        product.setName("air2020");
        product.setDescription("asd as d sad");
        product.setCategories(category1);
        product.setPrice(new BigDecimal(45000));
        productDao.save(product);

        assertEquals(1, productDao.findAll().size());

        Product product1 = productDao.findById(1L);

        assertEquals("air2020", product1.getName());

        product1.setName("pro2020");
        productDao.update(product1);


        Product product2 = productDao.findById(1L);

        assertEquals("pro2020", product2.getName());

        productDao.deleteAll();
        assertEquals(0, productDao.findAll().size());
    }
}
