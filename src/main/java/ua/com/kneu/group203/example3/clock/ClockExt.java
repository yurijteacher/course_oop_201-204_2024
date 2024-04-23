package ua.com.kneu.group203.example3.clock;

import java.util.Timer;
import java.util.TimerTask;

public class ClockExt extends Clock {
    private int second;

    public ClockExt(int second) {
        this.second = second;
    }

    public ClockExt(int hour, int second) {
        super(hour);
        this.second = second;
    }

    public ClockExt(int hour, int minute, int second) {
        super(hour, minute);
        this.second = second;
    }

    @Override
    public String toString() {
        return "ClockExt{" +
                super.toString() +
                "second=" + second +
                '}';
    }

    public void nextSecond(){

        second++;

        if(second == 60) {
            second = 0;
            nextMinute();
        }
    }


    public static void main(String[] args) {

        ClockExt clockExt = new ClockExt(1,1,1);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                clockExt.nextSecond();
                System.out.println(clockExt.toString());
            }
        },1000,1000);



    }

}
