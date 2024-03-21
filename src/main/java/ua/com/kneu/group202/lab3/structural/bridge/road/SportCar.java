package ua.com.kneu.group202.lab3.structural.bridge.road;

import ua.com.kneu.group202.lab3.structural.bridge.maker.Maker;

public class SportCar extends Car{
    public SportCar(Maker maker) {
        super(maker);
        maker.setMaker();
    }

    @Override
    public void roadType() {
        System.out.println("Sport Car");
    }
}
