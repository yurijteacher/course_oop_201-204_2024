package ua.com.kneu.group203.lab2.my_interface;

public class Calc implements Calculation, Info{
    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double sub(double x, double y) {
        return x-y;
    }

    @Override
    public void print() {
        System.out.println("Information");
    }
}
