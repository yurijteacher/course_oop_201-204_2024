package ua.com.kneu.group203.example4.shop.test;

import ua.com.kneu.group203.example4.shop.entity.Category;
import ua.com.kneu.group203.example4.shop.repository.CategoryRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        CategoryRepository categoryRepository = new CategoryRepository();

        Category category = new Category();
        category.setName("mac book air");
        category.setDescription("asd asd asd");
        category.setImage("/image.jpg");

//        categoryRepository.save(category);

        List<Category> categoryList = categoryRepository.findAll();

        for (Category c: categoryList){
            System.out.println(c);
        }

        Category category1 = categoryRepository.findById(2L);
        category1.setName("pro");

        categoryRepository.update(category1);

        List<Category> categoryList1 = categoryRepository.findAll();

        for (Category c: categoryList1){
            System.out.println(c);
        }

        Category category2 = categoryRepository.findById(2L);

        categoryRepository.delete(category2);

        List<Category> categoryList2 = categoryRepository.findAll();

        for (Category c: categoryList2){
            System.out.println(c);
        }



    }
}
