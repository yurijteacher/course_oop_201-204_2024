package ua.com.kneu.group204.example4.shop.test;

import ua.com.kneu.group204.example4.shop.entity.Category;
import ua.com.kneu.group204.example4.shop.repository.CategoryRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CategoryRepository categoryRepository = new CategoryRepository();

        Category c = new Category();
        c.setName("air");
        c.setDescription("asdsad");
        c.setLink("/fwe.jpg");


//        categoryRepository.save(c);

        List<Category> categories = categoryRepository.findAll();

        for(Category category : categories){
            System.out.println(category.getId()+":"+category.getName()+":"+category.getDescription()+":"+category.getLink());
        }

        Category category = categoryRepository.findById(4L);
//
        category.setName("pro");
        categoryRepository.update(category);
//
        List<Category> categories1 = categoryRepository.findAll();

        for(Category category1 : categories1){
            System.out.println(category1.getId()+":"+category1.getName()+":"+category1.getDescription()+":"+category1.getLink());
        }

        categoryRepository.deleteById(category);

        List<Category> categories2 = categoryRepository.findAll();

        for(Category category2 : categories2){
            System.out.println(category2.getId()+":"+category2.getName()+":"+category2.getDescription()+":"+category2.getLink());
        }


        categoryRepository.deleteAll();


    }

}
