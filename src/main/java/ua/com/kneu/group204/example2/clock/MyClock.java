package ua.com.kneu.group204.example2.clock;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class MyClock {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        System.out.println(calendar.get(Calendar.HOUR) + ":" +
                calendar.get(Calendar.MINUTE) +":"+
                calendar.get(Calendar.SECOND)
                );

        Timer timer = new Timer();

        Clock clock = new Clock();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                clock.print();
            }
        },1000,1000);
    }

}
