package ua.com.kneu.group204.lab2.aggregation;

public class Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine(1L, "seat 2000 cv", 2000);
        Engine engine2 = new Engine(2L, "honda 3000", 3000);

        Car seat2000 =new Car(1L, "Seat 2000", engine1);

        System.out.println(seat2000);

        seat2000.setEngine(engine2);

        System.out.println(seat2000);


    }

}
