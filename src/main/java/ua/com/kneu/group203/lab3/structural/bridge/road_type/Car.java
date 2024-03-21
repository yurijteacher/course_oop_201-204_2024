package ua.com.kneu.group203.lab3.structural.bridge.road_type;

import ua.com.kneu.group203.lab3.structural.bridge.maker.Maker;

public abstract class Car {
    Maker maker;
    public Car(Maker maker) {
        this.maker = maker;
        maker.setMaker();
    }

    public abstract void infoCar();


}
