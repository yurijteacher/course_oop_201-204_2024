package ua.com.kneu.lecture3.creational.singleton;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Singleton test1 = Singleton.getInstance();
        test1.print();

        Singleton test2 = Singleton.getInstance();
        test2.print();

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR));


    }

}
