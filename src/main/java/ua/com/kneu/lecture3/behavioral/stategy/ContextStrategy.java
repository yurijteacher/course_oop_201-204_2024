package ua.com.kneu.lecture3.behavioral.stategy;

public class ContextStrategy implements Strategy{
    private Strategy strategy;

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    @Override
    public double execute(double x, double y) {
        return strategy.execute(x,y);
    }
}
