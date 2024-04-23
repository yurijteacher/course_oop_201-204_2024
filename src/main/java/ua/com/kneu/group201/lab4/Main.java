package ua.com.kneu.group201.lab4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException {

        Car car1 = new Car(1, "seat2000","v8","auto",2500);

        Car car2 = new Car();
        car2.setId(2);
        car2.setName("Seat3000");
        car2.setEngine("v4");
        car2.setTransmission("manual");
        car2.setSizeCar(2300);

        System.out.println(car1);
        System.out.println(car2);

        Car car = new Car();

        Class classCar = car.getClass();

        Class classCar2 = Class.class;

        Class classCar3 = Class.forName("ua.com.kneu.group201.lab4.Car");

        Field[] fields = classCar.getDeclaredFields();

        // Інформація про всі змінні
        for (Field f : fields){
            System.out.println(f);
        }

        //
        Field field = classCar.getDeclaredField("name");
        System.out.println(field);

        Method[] methods = classCar.getDeclaredMethods();

        for (Method m : methods){
            System.out.println(m);
        }

        Method method = classCar.getDeclaredMethod("getName");
        System.out.println(method);

        Car car3 = new Car(3, "Seat4000","V6","auto",2500);

        Field fid = classCar.getDeclaredField("id");
        fid.setAccessible(true);
        fid.setInt(car3, 4);

        System.out.println(fid.get(car3));

        Class<?> type = fid.getType();
        System.out.println(type);
    }

}
