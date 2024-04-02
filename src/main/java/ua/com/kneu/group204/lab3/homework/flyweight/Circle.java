package ua.com.kneu.group204.lab3.homework.flyweight;

public class Circle implements Share {

    int r = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("x : " + x + ", y: " + y +", r: "+r);
    }

}