package ua.com.kneu.group204.example1;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class Robot {

    private double x = 0;
    private double y = 0;
    private double course = 0;
    private double distance = 0;

    private List<RobotLine> robotLines = new ArrayList<>();

    // get / set
    public List<RobotLine> getRobotLines() {
        return robotLines;
    }

    public void setRobotLines(List<RobotLine> robotLines) {
        this.robotLines = robotLines;
    }

    public void forward(){

//        x = x+1;
//        x++;
//        x = x + 5;
//        x+=5;

        double oldX = x;
        double oldY = y;

        x += distance * cos(course * PI/180);
        y += distance * sin(course * PI/180);


        // v.1
//        RobotLine robotLine = new RobotLine(oldX, oldY, x, y);
//        robotLines.add(robotLine);
        // v.2
//        RobotLine robotLine = new RobotLine();
//        robotLine.setNewX(oldX);
//        robotLine.setNewY(oldY);
//        robotLine.setNewY(y);
//        robotLine.setNewX(x);
//
//        robotLines.add(robotLine);

        // v.3
        robotLines.add(new RobotLine(oldX, oldY, x, y));
    }


    public void setX(double x){
        this.x = x;
    }



    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Robot() {
    }

    public Robot(double x) {
        this.x = x;
    }


    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Robot(double x, double y, double course) {
        this.x = x;
        this.y = y;
        this.course = course;
    }

    public Robot(double x, double y, double course, double distance) {
        this.x = x;
        this.y = y;
        this.course = course;
        this.distance = distance;
    }

    // psvm -> tab
    public static void main(String[] args) {

        Robot robot = new Robot(); // 0,0,0,0

        Robot robot1 = new Robot(1); // 0,0,0

        Robot robot2 = new Robot(1,2); // 1,2,0,0

        Robot robot3 = new Robot(1,2,3);

        Robot robot4 = new Robot(1,2,3,4);

        // sout -> tab
//        System.out.println(robot4.toString());

        System.out.println(robot);
        System.out.println(robot1);
        System.out.println(robot2);
        System.out.println(robot3);
        System.out.println(robot4);

        robot.setX(4);
        robot.setY(5);

        System.out.println(robot);

        System.out.println(robot.getX());


        robot.setX(0);
        robot.setY(0);
        robot.setCourse(90);
        robot.setDistance(100);

        robot.forward();
        System.out.println(robot);

        robot.setCourse(45);
        robot.setDistance(200);
        System.out.println(robot);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }
}
