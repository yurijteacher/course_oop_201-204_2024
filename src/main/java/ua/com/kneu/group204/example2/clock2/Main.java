package ua.com.kneu.group204.example2.clock2;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
       Clock clock = new Clock(1,2);
        System.out.println(clock);

//        ClockExt clockExt = new ClockExt(1,2,0);
//
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                clockExt.nextSecond();
//                System.out.println(clockExt);
//            }
//        },1000,1000);

        FrameClock frameClock = new FrameClock();



    }



}
