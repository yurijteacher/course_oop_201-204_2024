package ua.com.kneu.group203.lab3.structural.facade;

public class Main {

    public static void main(String[] args) {

//        Hello hello = new Hello();
//        World world = new World();
//
//        hello.printHello();
//        world.printWorld();
//
//
//        //
//
//        Hello hello1 = new Hello();
//        World world1 = new World();
//
//        hello1.printHello();
//        world1.printWorld();

        new Facade().print();

        Facade facade = new Facade();


        facade.print();
        facade.print();
    }

}
