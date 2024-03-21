package ua.com.kneu.group204.lab3.structural.bridge.road;

import ua.com.kneu.group204.lab3.structural.bridge.maker.Maker;

public abstract class Car {
    Maker maker;
    public Car(Maker maker) {
        this.maker = maker;
    }
    public abstract void showDetails();

}
