package ua.com.kneu.group201.lab3.structural.bridge.road;

import ua.com.kneu.group201.lab3.structural.bridge.maker.Maker;

public class SportCar extends Car{
    public SportCar(Maker maker) {
        super(maker);
    }

    @Override
    public void showDetail() {
        maker.setMaker();
        System.out.println("Sport Car");
    }
}
