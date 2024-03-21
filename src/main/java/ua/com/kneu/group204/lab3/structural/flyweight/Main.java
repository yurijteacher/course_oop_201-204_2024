package ua.com.kneu.group204.lab3.structural.flyweight;

public class Main {

    public static void main(String[] args) {

        Flyweight flyweight = new Flyweight();

        Drive drive = flyweight.getDriver("mysql");
        System.out.println(drive);

        Drive drive1 = flyweight.getDriver("mysql");
        System.out.println(drive1);

        System.out.println(drive1.getConnection("asd", "root", "ewr"));


    }


}
