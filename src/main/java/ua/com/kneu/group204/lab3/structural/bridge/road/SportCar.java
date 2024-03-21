package ua.com.kneu.group204.lab3.structural.bridge.road;

import ua.com.kneu.group204.lab3.structural.bridge.maker.Maker;

public class SportCar extends Car{
    public SportCar(Maker maker) {
        super(maker);
    }

    @Override
    public void showDetails() {
        maker.setMaker();
        System.out.println("This is a SportCar!");
    }
}
