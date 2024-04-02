package ua.com.kneu.lecture3.behavioral.stategy;

public class StrategyAdd implements Strategy{
    @Override
    public double execute(double x, double y) {
        return x+y;
    }
}
