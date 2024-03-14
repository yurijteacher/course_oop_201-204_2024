package ua.com.kneu.group202.lab2.realization;

public class Calculation implements Calc{
    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double sub(double x, double y) {
        return x-y;
    }
}
