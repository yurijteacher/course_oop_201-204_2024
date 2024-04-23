package ua.com.kneu.group204.lab4.car;

public class SelectorCar implements Car{

    Car car;
    @Override
    public void getModel() {
        car.getModel();
    }
}
