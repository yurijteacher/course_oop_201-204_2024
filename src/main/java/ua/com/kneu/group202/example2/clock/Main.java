package ua.com.kneu.group202.example2.clock;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer();
        ClockExt clockExt = new ClockExt(2,3,2);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                clockExt.nextSecond();
                System.out.println(clockExt.toString());
            }
        },1000,1000);


    }
}
