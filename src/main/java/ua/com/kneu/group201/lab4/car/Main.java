package ua.com.kneu.group201.lab4.car;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        Factory factory = new Factory();
        System.out.println(factory);

        SelectorCar selectorCar = factory.getInstance("/Users/urijlozovik/Downloads/course_oop_201-204_2024/src/main/java/ua/com/kneu/group201/lab4/car/file.txt");

        selectorCar.getModel();


    }
}
