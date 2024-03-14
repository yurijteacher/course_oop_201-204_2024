package ua.com.kneu.group201.lib2.aggregation;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine(1L, "Engine1", 2500);
        Engine engine2 = new Engine(2L, "Engine2", 3000);

        Car seat2000 = new Car(1L, "seat2000", engine1);

        System.out.println(seat2000);

        seat2000.setEngine(engine2);

        System.out.println(seat2000);


    }

}
