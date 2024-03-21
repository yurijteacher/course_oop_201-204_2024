package ua.com.kneu.group204.lab3.structural.bridge.road;

import ua.com.kneu.group204.lab3.structural.bridge.maker.Maker;

public class CityCar extends Car{
    public CityCar(Maker maker) {
        super(maker);
    }

    @Override
    public void showDetails() {
        maker.setMaker();
        System.out.println("City Car");
    }
}
