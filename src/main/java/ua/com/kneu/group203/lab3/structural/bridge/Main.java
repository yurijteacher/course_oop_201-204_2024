package ua.com.kneu.group203.lab3.structural.bridge;

import ua.com.kneu.group203.lab3.structural.bridge.maker.Bmw;
import ua.com.kneu.group203.lab3.structural.bridge.maker.Seat;
import ua.com.kneu.group203.lab3.structural.bridge.road_type.Car;
import ua.com.kneu.group203.lab3.structural.bridge.road_type.CityCar;
import ua.com.kneu.group203.lab3.structural.bridge.road_type.SportCar;

public class Main {

    public static void main(String[] args) {

        Car car = new SportCar(new Bmw());
        car.infoCar();

        Car car1 = new CityCar(new Seat());
        car1.infoCar();
    }

}
