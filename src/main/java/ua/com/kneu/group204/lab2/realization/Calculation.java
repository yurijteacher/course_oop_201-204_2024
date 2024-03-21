package ua.com.kneu.group204.lab2.realization;

public interface Calculation {

    final double c = 5; // const (final)

    public double add(double x, double y);

    double sub(double x, double y);

    default double mul(double x, double y){
        return x*y;
    };

    static double div(double x, double y){

//        double c = 0;
//        if(y==0){
//            c = 0;
//        } else {
//            c = x/y;
//        }
//
//        return c;


     return (y==0) ? 0 : x/y;
    };



}
