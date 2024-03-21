package ua.com.kneu.lecture3.creational.builder;

public class Car {

    private Long id;
    private String name;
    private Engine engine;
    private Transmission transmission;
    private SizeCar sizeCar;

    public Car() {
    }

    public Car(Long id, String name, Engine engine, Transmission transmission, SizeCar sizeCar, RoadType roadType) {
        this.id = id;
        this.name = name;
        this.engine = engine;
        this.transmission = transmission;
        this.sizeCar = sizeCar;
        this.roadType = roadType;
    }

    private RoadType roadType;

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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public SizeCar getSizeCar() {
        return sizeCar;
    }

    public void setSizeCar(SizeCar sizeCar) {
        this.sizeCar = sizeCar;
    }

    public RoadType getRoadType() {
        return roadType;
    }

    public void setRoadType(RoadType roadType) {
        this.roadType = roadType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", sizeCar=" + sizeCar +
                ", roadType=" + roadType +
                '}';
    }
}
