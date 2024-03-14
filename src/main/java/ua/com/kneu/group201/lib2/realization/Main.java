package ua.com.kneu.group201.lib2.realization;

public class Main {

    public static void main(String[] args) {

        Calculation calculation = new Calculation();

        System.out.println(calculation.add(5, 10));
        System.out.println(calculation.sub(10, 5));
        System.out.println(calculation.div(10, 0));
        System.out.println(Calc.mul(10, 10));

        calculation.getInfo();

    }

}
