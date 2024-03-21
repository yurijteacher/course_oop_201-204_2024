package ua.com.kneu.lecture3.creational.builder;

public class BuilderCar {

    private Long id = 1L;
    private String name = "def";
    private Engine engine = Engine.l2500;
    private Transmission transmission = Transmission.auto;
    private SizeCar sizeCar = SizeCar.s2500;
    private RoadType roadType = RoadType.sport;

    BuilderCar builderName(String name){
        this.name = name;
        return this;
    }
    BuilderCar builderEngine(Engine engine){
        this.engine = engine;
        return this;
    }

    BuilderCar builderTr(Transmission tr){
        this.transmission = tr;
        return this;
    }

    BuilderCar builderRt(RoadType rt){
        this.roadType = rt;
        return this;
    }

    BuilderCar builderSc(SizeCar sc){
        this.sizeCar = sc;
        return this;
    }

    public Car builder(){
        Car car = new Car();
        car.setEngine(engine);
        car.setTransmission(transmission);
        car.setSizeCar(sizeCar);
        car.setRoadType(roadType);
        car.setName(name);
        car.setId(id);

        return car;
    }


}
