package ua.com.kneu.group203.lab2.my_interface;

public class Main {

    public static void main(String[] args) {

        Calc calculation = new Calc();

        System.out.println(calculation.add(1, 2));
        System.out.println(calculation.sub(5, 2));
        System.out.println(calculation.div(10,2));
        System.out.println(Calculation.mul(2, 10));

        calculation.print();

    }


}
