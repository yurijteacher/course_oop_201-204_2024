package ua.com.kneu.group202.lab3.structural.bridge;

import ua.com.kneu.group202.lab3.structural.bridge.maker.Kia;
import ua.com.kneu.group202.lab3.structural.bridge.maker.Seat;
import ua.com.kneu.group202.lab3.structural.bridge.road.Car;
import ua.com.kneu.group202.lab3.structural.bridge.road.CityCar;
import ua.com.kneu.group202.lab3.structural.bridge.road.SportCar;

public class Main {

    public static void main(String[] args) {

        Car car = new SportCar(new Kia());
        car.roadType();


        Car car1 = new CityCar(new Seat());
        car1.roadType();

    }
}
