package ua.com.kneu.group202.example3.shop.test;

import ua.com.kneu.group202.example3.shop.entity.Category;
import ua.com.kneu.group202.example3.shop.entity.Product;
import ua.com.kneu.group202.example3.shop.repository.CategoryRepository;
import ua.com.kneu.group202.example3.shop.repository.ClientRepository;
import ua.com.kneu.group202.example3.shop.repository.ProductRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {


//        CategoryRepository categoryRepository = new CategoryRepository();
//
//
//        Category category = new Category();
//        category.setName("air");
//        category.setDescription("sdf sad sa d");
//        category.setLink("/air.jpg");
//
////        categoryRepository.save(category);
//
//        List<Category> categoryList = categoryRepository.findAll();
//
//        for (Category c: categoryList){
//            System.out.println(c.getName()+":"+c.getDescription()+":"+c.getLink());
//        }
//
//
//        Category category1 = categoryRepository.findById(2L);
//
//        category1.setName("pro");
//
////        categoryRepository.update(category1);
//
//        List<Category> categoryList2 = categoryRepository.findAll();
//
//        System.out.println("\n");
//        for (Category c: categoryList2){
//            System.out.println(c.getName()+":"+c.getDescription()+":"+c.getLink());
//        }
//
////        categoryRepository.delete(category1);
//
//
//        ProductRepository productRepository = new ProductRepository();
//
//        Product product = new Product();
//        product.setName("pro");
//        product.setDescription("asfd sad sad ");
//        product.setPrice(100000);
//        product.setLink("link");
//
//        Category category2 = categoryRepository.findById(1L);
//
//        product.setCategory(category2);
//
//        productRepository.save(product);
//
//
//        List<Product> products = productRepository.findAll();
//
//        for (Product el : products){
//            System.out.println(el);
//        }
//
//        Product product1 = products.get(0);
//        product1.setName("macbook air");
//        productRepository.update(product1);
//
//        List<Product> products2 = productRepository.findAll();
//
//        for (Product el : products2){
//            System.out.println(el);
//        }
//
//
//        Product product2 = productRepository.findById(2L);
//        System.out.println(product2);
//
//
//        productRepository.delete(product2);

        ClientRepository clientRepository = new ClientRepository();

        clientRepository.findAll();

    }



}
