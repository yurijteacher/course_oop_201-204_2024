package ua.com.kneu.group204.lab3.structural.facade;

public class Facade {

    public void print(){

        Hello hello = new Hello();
        World world = new World();
        hello.printHello();
        world.printWorld();;
    }

}
