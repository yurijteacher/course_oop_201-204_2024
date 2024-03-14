package ua.com.kneu.group203.lab2.composition;

public class Car {

    private Long id;
    private String name;
    private Engine engine;

    public Car(Long id, String name) {
        this.id = id;
        this.name = name;
        this.engine = new Engine(1L, "honda", 2500);
    }


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

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
