package ua.com.kneu.unit5;

public class RobotManager {

    public static void main(String[] args) {

        Robot robot =  new Robot();
//        robot.x = 5;
        robot.setX(0);
        robot.setY(20);
        robot.setCourse(45);
        robot.setDistance(100);

        System.out.println(robot);


        Robot robot1 = new Robot(1);
        Robot robot2 = new Robot(2,2);
        Robot robot3 = new Robot(3,2,45);
        Robot robot4 = new Robot(4,3,90,100);


        System.out.println(robot);

        System.out.println(robot1);
        System.out.println(robot2);
        System.out.println(robot3);
        System.out.println(robot4);
    }

}
