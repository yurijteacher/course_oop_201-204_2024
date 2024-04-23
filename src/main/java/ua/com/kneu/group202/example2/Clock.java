package ua.com.kneu.group202.example2;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Clock {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        System.out.println(calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE) +":"+calendar.get(Calendar.SECOND));

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Calendar calendar1 = Calendar.getInstance();
                System.out.println(calendar1.get(Calendar.HOUR)+":"+calendar1.get(Calendar.MINUTE) +":"+calendar1.get(Calendar.SECOND));
            }
        },1000,1000);


    }
}
