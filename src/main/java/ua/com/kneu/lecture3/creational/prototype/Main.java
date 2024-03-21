package ua.com.kneu.lecture3.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Robot robot1 = new Robot(1L, "t1000", "Sony");
        Robot robot2 = robot1.copy(2L, "t1001", "Samsung");

        List<Robot> robots = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            robots.add(robot1.copy((i+1L), "robot"+i, "Sony"));
        }

        for (Robot el : robots){
            System.out.println(el);
        }

    }

}
