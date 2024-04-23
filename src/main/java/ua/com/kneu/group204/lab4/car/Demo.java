package ua.com.kneu.group204.lab4.car;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException, NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        Factory factory = new Factory();

       SelectorCar selectorCar = factory.getInstance("/Users/urijlozovik/Downloads/course_oop_201-204_2024/src/main/java/ua/com/kneu/group204/lab4/car/file.txt");

       selectorCar.getModel();

    }
}
