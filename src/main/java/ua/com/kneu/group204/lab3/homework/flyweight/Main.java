package ua.com.kneu.group204.lab3.homework.flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        FactoryShare factoryShare = new FactoryShare();

        ArrayList<Share> shapes = new ArrayList<>();
        shapes.add(factoryShare.getShape("квадрат"));
        shapes.add(factoryShare.getShape("точка"));
        shapes.add(factoryShare.getShape("коло"));

        for(Share shape : shapes){
            int x = new Random().nextInt(101);
            int y = new Random().nextInt(101);
            shape.draw(x, y);
        }
    }
}
