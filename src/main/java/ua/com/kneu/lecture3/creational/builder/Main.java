package ua.com.kneu.lecture3.creational.builder;

public class Main {

    public static void main(String[] args) {

        BuilderCar builderCar = new BuilderCar();

        Car car = builderCar
                .builderName("BMW5")
                .builderRt(RoadType.sport)
                .builderTr(Transmission.manual)
                .builderEngine(Engine.l3500)
                .builderSc(SizeCar.s1700)
                .builder();

        System.out.println(car);


        Car car1 = builderCar
                .builderTr(Transmission.manual)
                .builderEngine(Engine.l3000)
                .builder();

        System.out.println(car1);

    }


}
