package ua.com.kneu.group201.lab3.flyweight;

public class Main {

    public static void main(String[] args) {

        FlyWeight factory = new FlyWeight();

        Drive drive = factory.getDriver("postgres");
        System.out.println(drive);

        Drive drive1 = factory.getDriver("postgres");
        System.out.println(drive1);

    }
}
