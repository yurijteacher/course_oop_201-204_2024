package ua.com.kneu.group202.lab3.structural.facade;

public class Facade {
    public void print(){
        Hello hello =new Hello();
        World world = new World();
        hello.printHello();
        world.printWorld();
    }

}
