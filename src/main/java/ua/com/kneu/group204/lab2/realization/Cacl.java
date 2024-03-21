package ua.com.kneu.group204.lab2.realization;

public class Cacl implements Calculation{
    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double sub(double x, double y) {
        return x-y;
    }
}
