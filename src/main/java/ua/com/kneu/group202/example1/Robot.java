package ua.com.kneu.group202.example1;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class Robot {

    private double x = 0;
    private double y = 0;
    private double course = 0;
    private double distance = 0;
    private List<RobotLine> robotLines = new ArrayList<>();

    public List<RobotLine> getRobotLines() {
        return robotLines;
    }

    public void setRobotLines(List<RobotLine> robotLines) {
        this.robotLines = robotLines;
    }

    public Robot() {}

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

    public void forward(){

//        double j = 0;
//        j=j+1;
//        j++;
//        j=j+4;
//        j+=4;

        double oldX = x;
        double oldY = y;

        x += distance * cos(course * PI/180);
        y += distance * sin(course * PI/180);

//        // v.1
//        RobotLine robotLine = new RobotLine(oldX, oldY, x, y);
//        robotLines.add(robotLine);

        // v.2
        robotLines.add(new RobotLine(oldX, oldY, x, y));

//        // v.3
//        RobotLine robotLine1 = new RobotLine();
//        robotLine1.setOldX(oldX);
//        robotLine1.setOldY(oldY);
//        robotLine1.setNewX(x);
//        robotLine1.setNewY(y);
//        robotLines.add(robotLine1);

    }

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getX(){
        return this.x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public double getDistance() {
        return distance;
    }

    /*
    byte
    short
    int
    long
    float
    double
    char
    boolean
     */

    /*
        String "text"
        Date
        Object
     */


    public static void main(String[] args) {

        Robot robot = new Robot();

        robot.setX(10);

        System.out.println(robot.toString());

        System.out.println(robot.getX());

        robot.setX(0);
        robot.setCourse(45);
        robot.setDistance(100);

        robot.forward();
        System.out.println(robot);

        Robot robot1 = new Robot(1);
        Robot robot2 = new Robot(1,2);
        Robot robot3 = new Robot(1,2,45);
        Robot robot4 = new Robot(1,2,45, 100);


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
