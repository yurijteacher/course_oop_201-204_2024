package ua.com.kneu.group201.lib2.realization;

public interface Calc {

    final double c = 5; // JAVA - константи final
    double b = 10; // константа

    public double add(double x, double y);
    double sub(double x, double y);
    default double div(double x, double y){

//        double templ = 0;
//        if(y==0){
//            templ = 0;
//        } else {
//            templ = x/y;
//        }
//
//        return templ;

        return (y==0) ? 0 : x/y;
    };
    static double mul(double x, double y){
        return x*y;
    };
}
