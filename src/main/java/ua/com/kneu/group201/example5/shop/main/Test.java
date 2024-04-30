package ua.com.kneu.group201.example5.shop.main;

import ua.com.kneu.group201.example5.shop.dao.CategoryDao;
import ua.com.kneu.group201.example5.shop.entity.Category;
import ua.com.kneu.group201.example5.shop.entity.Product;
import ua.com.kneu.group201.example5.shop.entity.Users;
import ua.com.kneu.group201.example5.shop.repository.CategoryRepository;
import ua.com.kneu.group201.example5.shop.repository.ProductRepository;
import ua.com.kneu.group201.example5.shop.repository.UserRepository;

import java.util.List;

public class Test {

    public static void main(String[] args) {


        CategoryRepository categoryRepository = new CategoryRepository();


        Category category = new Category();
        category.setName("air");
        category.setDescription("asd asd asd");
        category.setLink("/images/macbook/air.jpg");

//        categoryRepository.save(category);


        List<Category> categoryList = categoryRepository.findAll();

        for(Category el:categoryList){
            System.out.println(el);
        }


          Category  category1 = categoryRepository.findById(2L);

        System.out.println(category1);


        category1.setName("pro");

        categoryRepository.update(category1);
        Category  category2 = categoryRepository.findById(2L);

        System.out.println(category2);


//        categoryRepository.deleteByObj(category2);

        List<Category> categories = categoryRepository.findAll();

        System.out.println(categories.size());


        ProductRepository productRepository = new ProductRepository();

        Product product = new Product();
        product.setName("Macbook air 2020");
        product.setDescription("sadas d sa d as");
        product.setPrice(10000.2);
        product.setImage("/images/air.jpg");
        product.setCategory(category2);

        productRepository.save(product);


        List<Product> products = productRepository.findAll();

        for (Product el : products){
            System.out.println(el.getName());
        }


        UserRepository userRepository = new UserRepository();

        List<Users> users = userRepository.findAll();

        System.out.println(users.size());
    }

}
