package ua.com.kneu.group201.lab3.facade;

import ua.com.kneu.group204.lab3.structural.facade.Facade;

public class Main2 {

    public static void main(String[] args) {

        Hello hello = new Hello();
        World world = new World();
        hello.printHello();
        world.printWorld();

        new Facade().print();

    }
}
