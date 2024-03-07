package ua.com.kneu.unit4.test;

import ua.com.kneu.unit4.RobotDefault;
import ua.com.kneu.unit4.RobotPrivate;
import ua.com.kneu.unit4.RobotProtected;
import ua.com.kneu.unit4.RobotPublic;

public class Main {

    public static void main(String[] args) {

        RobotPrivate robotPrivate = new RobotPrivate();
        //    robotPrivate.x =5;

        RobotDefault robotDefault = new RobotDefault();
//        robotDefault.x = 5;
        RobotProtected robotProtected = new RobotProtected();
//        robotProtected.x = 5;
        RobotPublic robotPublic = new RobotPublic();
        robotPublic.x = 5;
        robotPublic.y = 10;
        robotPublic.course = 10;
        robotPublic.distance  = 100;

        System.out.println(robotPublic);
    }
}
