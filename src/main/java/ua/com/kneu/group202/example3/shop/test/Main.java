package ua.com.kneu.group202.example3.shop.test;

import ua.com.kneu.group202.example3.shop.entity.Category;
import ua.com.kneu.group202.example3.shop.repository.CategoryRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        CategoryRepository categoryRepository = new CategoryRepository();


        Category category = new Category();
        category.setName("air");
        category.setDescription("sdf sad sa d");
        category.setLink("/air.jpg");

//        categoryRepository.save(category);

        List<Category> categoryList = categoryRepository.findAll();

        for (Category c: categoryList){
            System.out.println(c.getName()+":"+c.getDescription()+":"+c.getLink());
        }


        Category category1 = categoryRepository.findById(2L);

        category1.setName("pro");

        categoryRepository.update(category1);

        List<Category> categoryList2 = categoryRepository.findAll();

        System.out.println("\n");
        for (Category c: categoryList2){
            System.out.println(c.getName()+":"+c.getDescription()+":"+c.getLink());
        }

        categoryRepository.delete(category1);

    }

}
