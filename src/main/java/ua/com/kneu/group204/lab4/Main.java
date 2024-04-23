package ua.com.kneu.group204.lab4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException {

        Car car2 = new Car(1, "seat2000","v8","manual",2500);

        Car car1 = new Car();
        car1.setId(2);
        car1.setName("seat3000");
        car1.setTransmission("auto");
        car1.setEngine("V8");
        car1.setSizeCar(2300);

        System.out.println(car1);
        System.out.println(car2);

        Car car = new Car();
        Class classCar = car.getClass();

        Field[] fields = classCar.getDeclaredFields();

        for (Field f : fields){
            System.out.println(f);
        }

        Field f = classCar.getDeclaredField("id");
        System.out.println(f);

        Method[] methods = classCar.getDeclaredMethods();
        for (Method m : methods)
        {
            System.out.println(m);
        }

        Method method = classCar.getDeclaredMethod("getName");
        System.out.println(method);

        Car car3 = new Car(3,"seat3000","V8","auto",2500);

        Field fid = classCar.getDeclaredField("id");
        System.out.println(fid);

        fid.setAccessible(true);

        fid.setInt(car3, 4);

        System.out.println(fid.get(car3));


    }


}
