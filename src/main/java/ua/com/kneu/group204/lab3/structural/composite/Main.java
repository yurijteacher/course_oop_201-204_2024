package ua.com.kneu.group204.lab3.structural.composite;

public class Main {
    public static void main(String[] args) {

        Robot t1000 = new RobotT1000();
        Robot t2000 = new RobotT2000();

        RobotComposite composite1 = new RobotComposite();
        composite1.addComposite(t1000);
        composite1.addComposite(t2000);

        composite1.action();

        Robot t3000 = new RobotT3000();

        RobotComposite composite2 = new RobotComposite();
        composite2.addComposite(t3000);

        composite1.addComposite(composite2);

        composite1.action();


    }

}
