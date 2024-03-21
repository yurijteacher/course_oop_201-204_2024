package ua.com.kneu.lecture3.creational.abstract_factory.leg;

import ua.com.kneu.lecture3.creational.abstract_factory.Leg;

public class SonyLeg implements Leg {
    @Override
    public void go() {
        System.out.println("SonyLeg");
    }
}
