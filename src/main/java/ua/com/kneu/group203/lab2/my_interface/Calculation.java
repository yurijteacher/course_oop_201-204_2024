package ua.com.kneu.group203.lab2.my_interface;

public interface Calculation {

    public double add(double x, double y);
    double sub(double x, double y);
    default double div(double x, double y){

//        double c = 0;
//
//        if(y==0){
//            c = 0;
//        } else {
//            c = x/y;
//        }
//
//        return c;

        return (y==0) ? 0 : x/y;
    };
    static double mul(double x, double y){
        return x*y;
    };
}
