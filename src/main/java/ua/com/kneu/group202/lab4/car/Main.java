package ua.com.kneu.group202.lab4.car;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        Factory factory = new Factory();
        System.out.println(factory);
        Factory factory1 = Factory.getFactory();

        SelectorCar selectorCar = factory1.getInstance("/Users/urijlozovik/Downloads/course_oop_201-204_2024/src/main/java/ua/com/kneu/group202/lab4/car/file.txt");

        selectorCar.getModel();



    }
}
