package ua.com.kneu.group204.example4.shop.test;

import ua.com.kneu.group204.example4.shop.entity.Category;
import ua.com.kneu.group204.example4.shop.entity.Product;
import ua.com.kneu.group204.example4.shop.repository.CategoryRepository;
import ua.com.kneu.group204.example4.shop.repository.ClientRepository;
import ua.com.kneu.group204.example4.shop.repository.ProductRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        CategoryRepository categoryRepository = new CategoryRepository();
//
//        Category c = new Category();
//        c.setName("air");
//        c.setDescription("asdsad");
//        c.setLink("/fwe.jpg");
//
//
////        categoryRepository.save(c);
//
//
//        List<Category> categories = categoryRepository.findAll();
//
//        for(Category category : categories){
//            System.out.println(category.getId()+":"+category.getName()+":"+category.getDescription()+":"+category.getLink());
//        }
//
//        Category category = categoryRepository.findById(5L);
////
//        category.setName("pro");
//        categoryRepository.update(category);
////
//        List<Category> categories1 = categoryRepository.findAll();
//
//        for(Category category1 : categories1){
//            System.out.println(category1.getId()+":"+category1.getName()+":"+category1.getDescription()+":"+category1.getLink());
//        }
//
////        categoryRepository.deleteById(category);
//
//        List<Category> categories2 = categoryRepository.findAll();
//
//        for(Category category2 : categories2){
//            System.out.println(category2.getId()+":"+category2.getName()+":"+category2.getDescription()+":"+category2.getLink());
//        }
//
//        // categoryRepository.deleteAll();
//
//
//        ProductRepository productRepository = new ProductRepository();
//
//        Product product = new Product();
//        product.setName("air");
//        product.setDescription("asfd sad as d a");
//        product.setPrice(1100.00);
//        product.setCategory(category);
//        product.setImage("/images/img/1.jpg");
//
////        productRepository.save(product);
//
//        List<Product> products = productRepository.findAll();
//
//
//        for(Product el : products){
//            System.out.println(el);
//        }
//
//        Product product1 = productRepository.findById(1L);
//        System.out.println(product1);
//
//        product1.setName("pro");
//
//        productRepository.update(product1);
//        Product product2 = productRepository.findById(1L);
//        System.out.println(product2);
//
//
//        productRepository.deleteById(product1);
//
//        List<Product> products1 = productRepository.findAll();
//
//        System.out.println(products1.size());


        ClientRepository clientRepository = new ClientRepository();

        System.out.println(clientRepository.findAll().size());

    }

}
