package ua.com.kneu.group204.lab3.homework.flyweight;

public class Square implements Share {
    int a = 20;

    @Override
    public void draw(int x, int y) {
        System.out.println("x: " + x + ", y: "+ y +", a: " + a);
    }

}