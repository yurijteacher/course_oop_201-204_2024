package ua.com.kneu.group201.lab3.structural.bridge.main;

import ua.com.kneu.group201.lab3.structural.bridge.maker.Kia;
import ua.com.kneu.group201.lab3.structural.bridge.maker.Seat;
import ua.com.kneu.group201.lab3.structural.bridge.road.Car;
import ua.com.kneu.group201.lab3.structural.bridge.road.CityCar;
import ua.com.kneu.group201.lab3.structural.bridge.road.SportCar;

public class Main {

    public static void main(String[] args) {

        Car kia2000 = new SportCar(new Kia());
        kia2000.showDetail();

        Car seat3000 = new CityCar(new Seat());
        seat3000.showDetail();

    }
}
