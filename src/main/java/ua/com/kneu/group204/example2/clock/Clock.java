package ua.com.kneu.group204.example2.clock;

import java.util.Calendar;

public class Clock {

    public void print(){

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.HOUR) + ":" +
                calendar.get(Calendar.MINUTE) +":"+
                calendar.get(Calendar.SECOND)
        );

    }

}
