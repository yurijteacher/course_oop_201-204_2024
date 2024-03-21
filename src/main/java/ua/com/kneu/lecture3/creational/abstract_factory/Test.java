package ua.com.kneu.lecture3.creational.abstract_factory;

import ua.com.kneu.lecture3.creational.abstract_factory.body.AppleBody;
import ua.com.kneu.lecture3.creational.abstract_factory.body.SonyBody;
import ua.com.kneu.lecture3.creational.abstract_factory.hand.SamsungHand;
import ua.com.kneu.lecture3.creational.abstract_factory.head.SonyHead;
import ua.com.kneu.lecture3.creational.abstract_factory.leg.SonyLeg;
import ua.com.kneu.lecture3.creational.abstract_factory.robotT1000.RobotT1000;

public class Test {

    public static void main(String[] args) {

        SonyBody sonyBody = new SonyBody();
        SamsungHand samsungHand = new SamsungHand();
        AppleBody appleBody = new AppleBody();
        SonyHead sonyHead = new SonyHead();
        SonyLeg sonyLeg = new SonyLeg();

        Robot robot = new RobotT1000();
        robot.setBody(sonyBody);
        robot.setHand(samsungHand);
        robot.setHead(sonyHead);
        robot.setLeg(sonyLeg);

        System.out.println(robot);


        Robot robot1 = new RobotT1000();
        robot1.setBody(appleBody);
        robot1.setHand(samsungHand);
        robot1.setHead(sonyHead);
        robot1.setLeg(sonyLeg);



    }

}
