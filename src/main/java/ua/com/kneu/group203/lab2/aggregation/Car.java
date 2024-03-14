package ua.com.kneu.group203.lab2.aggregation;

public class Car {

    private Long id;
    private String name;
    private Engine engine;

    public Car(Long id, String name, Engine engine) {
        this.id = id;
        this.name = name;
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
