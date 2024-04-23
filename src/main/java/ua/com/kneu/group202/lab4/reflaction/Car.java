package ua.com.kneu.group202.lab4.reflaction;

public class Car {

    private int id = 5;
    private String name;
    private String engine;
    private String transmission;
    private String manuf;

    public Car() {
    }

    public Car(int id, String name, String engine, String transmission, String manuf) {
        this.id = id;
        this.name = name;
        this.engine = engine;
        this.transmission = transmission;
        this.manuf = manuf;
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

    public String getManuf() {
        return manuf;
    }

    public void setManuf(String manuf) {
        this.manuf = manuf;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", manuf='" + manuf + '\'' +
                '}';
    }
}
