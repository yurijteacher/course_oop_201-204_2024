package ua.com.kneu.group202.lab2.composition;

import ua.com.kneu.group202.lab2.aggregation.Engine;

public class Car {

    private Long id;
    private String name;
    private Engine engine;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(Long id, String name) {
        this.id = id;
        this.name = name;
        this.engine = new Engine(1L, "sean2000", 2000);
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
