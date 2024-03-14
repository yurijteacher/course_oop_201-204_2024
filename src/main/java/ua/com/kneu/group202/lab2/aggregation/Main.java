package ua.com.kneu.group202.lab2.aggregation;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine(1L, "bmw2500", 2500);
        Engine engine2 = new Engine(2L, "bmw3000", 3000);

        System.out.println(engine1);


        Car bmw3 = new Car(1L, "bmw3", engine1);
        System.out.println(bmw3);

        Car bmw5 = new Car(2L, "bmw5", engine2);
        Car bmw7 = new Car(3L, "bmw7", engine1);


        bmw3.setEngine(engine2);
        System.out.println(bmw3);


    }

}
