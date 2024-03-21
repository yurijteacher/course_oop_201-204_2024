package ua.com.kneu.group201.lab3.bridge.road;

import ua.com.kneu.group201.lab3.bridge.maker.Maker;

public class CityCar extends Car{
    public CityCar(Maker maker) {
        super(maker);
    }

    @Override
    public void showDetail() {
        maker.setMaker();
        System.out.println("City Car");
    }
}
