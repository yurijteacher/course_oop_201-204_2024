package ua.com.kneu.group202.lab2.generalization;

public class RobotT1000 extends Robot{
    @Override
    public void forward() {
        System.out.println("forward");
    }

    @Override
    public void dance() {
        System.out.println("dance");
    }

    @Override
    public void calc() {
        System.out.println("calc");
    }
}
