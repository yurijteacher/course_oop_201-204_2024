package ua.com.kneu.group202.lab4.reflaction;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException {

        // v1.
        Car car1 = new Car(1,"ford","2500","auto", "FordCo");

        // v2.
        Car car2 = new Car();
        car2.setId(2);
        car2.setName("seat 2000");
        car2.setEngine("seat 2000SV");
        car2.setTransmission("manual");
        car2.setManuf("Seat Co");


        System.out.println(car1);
        System.out.println(car2);


        Car car = new Car();
        // v3.
        Class classCar = Car.class;

        // v4
        Class classCar2 =  car.getClass();

        Field[] fields = classCar2.getDeclaredFields();

        for(Field f : fields){
            System.out.println(f);
        }

        try {
            Field field = classCar2.getDeclaredField("name");
            System.out.println(field);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        Method[] methods = classCar2.getDeclaredMethods();

        for(Method m : methods){
            System.out.println(m);
        }


        Method m = classCar2.getDeclaredMethod("getEngine");
        System.out.println(m);

        Car car3 = new Car(3, "BMW","2500","auto","BMW Co");

        Field fid = classCar2.getDeclaredField("id");
        System.out.println(fid);

        fid.setAccessible(true);
        fid.setInt(car3, 4);

        System.out.println(car3.getId());
        System.out.println(fid.get(car3));

        Class<?> type = fid.getType();
        System.out.println(type);

        int modif = fid.getModifiers();
        System.out.println(modif);
    }
}
