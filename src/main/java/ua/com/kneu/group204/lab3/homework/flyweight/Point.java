package ua.com.kneu.group204.lab3.homework.flyweight;

public class Point implements Share {

    @Override
    public void draw(int x, int y) {
        System.out.println("point - x: "+ x + ", y: " + y);
    }

}