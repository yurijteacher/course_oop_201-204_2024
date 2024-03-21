package ua.com.kneu.group204.lab3.structural.bridge.main;

import ua.com.kneu.group204.lab3.structural.bridge.maker.Kia;
import ua.com.kneu.group204.lab3.structural.bridge.maker.Seat;
import ua.com.kneu.group204.lab3.structural.bridge.road.Car;
import ua.com.kneu.group204.lab3.structural.bridge.road.CityCar;
import ua.com.kneu.group204.lab3.structural.bridge.road.SportCar;

public class Main {

    public static void main(String[] args) {

        Car seat2000 = new CityCar(new Seat());
        seat2000.showDetails();

        Car kiaS3 = new SportCar(new Kia());
        kiaS3.showDetails();

    }

}
