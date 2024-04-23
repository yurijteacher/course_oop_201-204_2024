package ua.com.kneu.group201.lab4;

public class Car {

    private int id;
    private String name;
    private String engine;
    private String transmission;
    private double sizeCar;

    public Car() {
    }

    public Car(int id, String name, String engine, String transmission, double sizeCar) {
        this.id = id;
        this.name = name;
        this.engine = engine;
        this.transmission = transmission;
        this.sizeCar = sizeCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public double getSizeCar() {
        return sizeCar;
    }

    public void setSizeCar(double sizeCar) {
        this.sizeCar = sizeCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", sizeCar=" + sizeCar +
                '}';
    }
}
