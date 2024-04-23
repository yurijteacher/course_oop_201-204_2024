package ua.com.kneu.group202.lab4.car;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;

public class Factory {

    private static Factory factory;

    public static Factory getFactory() {

        if(factory == null) {
            factory = new Factory();
        }

        return factory;
    }

    public SelectorCar getInstance(String file) throws IOException, NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        String[] data = new BufferedReader(new FileReader(file)).readLine().split(":");

        SelectorCar selectorCar = new SelectorCar();
        Class classCar =  selectorCar.getClass();

        Field field = classCar.getDeclaredField(data[1]);

        field.setAccessible(true);

        Class createCar = Class.forName(data[2]);
        Car car = (Car) createCar.newInstance();

        field.set(selectorCar, car);

        return selectorCar;
    }


}
