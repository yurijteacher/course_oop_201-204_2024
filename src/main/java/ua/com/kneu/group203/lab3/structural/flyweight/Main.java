package ua.com.kneu.group203.lab3.structural.flyweight;

public class Main {

    public static void main(String[] args) {

        FlyWeight factory = new FlyWeight();

        Drive drive = factory.getDriver("postgres");
        Drive drive1 = factory.getDriver("postgres");

        System.out.println(drive1);
        System.out.println(drive);




    }
}
