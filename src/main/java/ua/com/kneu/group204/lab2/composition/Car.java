package ua.com.kneu.group204.lab2.composition;

public class Car {

    private Long id;
    private String model;

    private Engine engine;

    public Car(Long id, String model) {
        this.id = id;
        this.model = model;
        this.engine = new Engine(1L, "Honda 2000", 2000);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
