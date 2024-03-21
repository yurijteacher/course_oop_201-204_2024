package ua.com.kneu.group201.lab3.bridge.main;

import ua.com.kneu.group201.lab3.bridge.maker.Kia;
import ua.com.kneu.group201.lab3.bridge.maker.Seat;
import ua.com.kneu.group201.lab3.bridge.road.Car;
import ua.com.kneu.group201.lab3.bridge.road.CityCar;
import ua.com.kneu.group201.lab3.bridge.road.SportCar;

public class Main {

    public static void main(String[] args) {

        Car kia2000 = new SportCar(new Kia());
        kia2000.showDetail();

        Car seat3000 = new CityCar(new Seat());
        seat3000.showDetail();

    }
}
