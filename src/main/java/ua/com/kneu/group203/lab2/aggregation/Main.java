package ua.com.kneu.group203.lab2.aggregation;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine(1L, "honda 2500 s", 2500);
        Engine engine2 = new Engine(2L, "honda 3000 cv", 3000);


        Car honda2500 = new Car(1L, "honda CV", engine1);

        System.out.println(honda2500);

        Car honda2500s = new Car(2L, "honda 2500 sport", engine1);

        honda2500.setEngine(engine2);

        System.out.println(honda2500);
    }

}
