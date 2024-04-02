package ua.com.kneu.lecture3.behavioral.stategy;

public class StrategyDiv implements Strategy {
    @Override
    public double execute(double x, double y) {

//        double c = 0;
//
//        if (y == 0) {
//            c = 0;
//        } else {
//            c = x / y;
//        }

        //  c = (y == 0) ? 0 : x / y;

        return (y == 0) ? 0 : x / y;
    }
}
