package ua.com.kneu.group202.lab2.realization;

public interface Calc {

    final double c = 0;
    double add(double x, double y);
    double sub(double x, double y);
    default double mul(double x, double y){
        return x*y;
    };
    static double div(double x, double y){

//        double templ = 0;
//
//        if(y==0){
//            templ = 0;
//        } else {
//            templ = x/y;
//        }
//
//        return templ;


        return (y==0) ? 0 : x/y;
    };

}
