package ua.com.kneu.group202.lab4.car;

public class SelectorCar implements Car{

    private Car car;

    public SelectorCar() {
    }

    @Override
    public void getModel() {
        car.getModel();
    }
}
