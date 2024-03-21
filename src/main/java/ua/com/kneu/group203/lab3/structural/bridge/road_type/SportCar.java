package ua.com.kneu.group203.lab3.structural.bridge.road_type;

import ua.com.kneu.group203.lab3.structural.bridge.maker.Maker;

public class SportCar extends Car{
    public SportCar(Maker maker) {
        super(maker);
    }

    @Override
    public void infoCar() {
        System.out.println("Sport Car");
    }
}
