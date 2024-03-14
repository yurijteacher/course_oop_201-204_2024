package ua.com.kneu.group201.lib2.composition;

public class Car {

    private Long id;
    private String model;
    private Engine engine;

    public Car() {
    }

    public Car(Long id, String model) {
        this.id = id;
        this.model = model;
        this.engine = new Engine(1L, "Honda 2500", 2500);
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

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
