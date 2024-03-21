package ua.com.kneu.group203.lab3.structural.bridge.road_type;

import ua.com.kneu.group203.lab3.structural.bridge.maker.Maker;

public class CityCar extends Car{
    public CityCar(Maker maker) {
        super(maker);
    }

    @Override
    public void infoCar() {
        System.out.println("City Car");
    }
}
