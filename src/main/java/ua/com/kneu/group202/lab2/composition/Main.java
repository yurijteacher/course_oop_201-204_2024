package ua.com.kneu.group202.lab2.composition;

import ua.com.kneu.group202.lab2.aggregation.Car;
import ua.com.kneu.group202.lab2.aggregation.Engine;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(1L, "bmw2", new Engine(1L, "honda", 2500));

        System.out.println(car);



    }

}
