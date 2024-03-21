package ua.com.kneu.group204.lab2.realization;

public class Main {
    public static void main(String[] args) {

        Cacl calc = new Cacl();
        System.out.println(calc.add(1, 2));
        System.out.println(calc.sub(4, 5));
        System.out.println(calc.mul(4, 5));

        System.out.println(Calculation.div(10, 2));

    }

}
