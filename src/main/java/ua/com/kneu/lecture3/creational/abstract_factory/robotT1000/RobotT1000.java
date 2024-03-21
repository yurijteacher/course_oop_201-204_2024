package ua.com.kneu.lecture3.creational.abstract_factory.robotT1000;

import ua.com.kneu.lecture3.creational.abstract_factory.*;

public class RobotT1000 extends Robot {
    @Override
    public void dance() {
        System.out.println("dance");
    }

    public RobotT1000() {
    }

    public RobotT1000(Body body, Hand hand, Head head, Leg leg) {
        super(body, hand, head, leg);
    }

}
