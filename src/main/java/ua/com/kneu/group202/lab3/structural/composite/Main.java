package ua.com.kneu.group202.lab3.structural.composite;

public class Main
{

    public static void main(String[] args) {

        Robot t1000 = new RobotT1000();
        Robot t2000 = new RobotT2000();
        Robot t3000 = new RobotT3000();

        RobotComposite composite1 = new RobotComposite();
        composite1.addComposite(t1000);
        composite1.addComposite(t2000);

        RobotComposite composite2 = new RobotComposite();
        composite2.addComposite(t3000);

        composite2.addComposite(composite1);

        composite2.active();

        System.out.println(composite2.hashCode());

        t1000.active();

        composite1.active();


    }
}
