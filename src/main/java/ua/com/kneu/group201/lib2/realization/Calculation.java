package ua.com.kneu.group201.lib2.realization;

public class Calculation implements Calc, Info {

    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double sub(double x, double y) {
        return x-y;
    }

    @Override
    public void getInfo() {
        System.out.println("calculation");
    }
}
