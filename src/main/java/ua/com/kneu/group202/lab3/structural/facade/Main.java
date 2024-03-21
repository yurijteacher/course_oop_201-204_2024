package ua.com.kneu.group202.lab3.structural.facade;

import ua.com.kneu.group204.lab3.structural.facade.Facade;
import ua.com.kneu.lecture3.creational.factory.Factory;

public class Main {
    public static void main(String[] args) {

//        Hello hello =new Hello();
//        World world = new World();
//        hello.printHello();
//        world.printWorld();

//        Hello hello =new Hello();
//        World world = new World();
//        hello.printHello();
//        world.printWorld();


//        Hello hello =new Hello();
//        World world = new World();
//        hello.printHello();
//        world.printWorld();

        new Facade().print();

        Facade f = new Facade();

        f.print();
        f.print();
        f.print();


    }
}
