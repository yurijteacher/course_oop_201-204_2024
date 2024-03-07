package ua.com.kneu.group203.example1;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class Robot {

    private double x = 0;
    private double y = 0;
    private double course = 0;
    private double distance = 0;
    private List<RobotLine> robotLineList = new ArrayList<>();

    public List<RobotLine> getRobotLineList() {
        return robotLineList;
    }

    public void setRobotLineList(List<RobotLine> robotLineList) {
        this.robotLineList = robotLineList;
    }

    public void forward(){
//        int j = 0;
//        j = j+1;
//        j++;
//        j = j+5;
//        j+=5;

        double oldX = x;
        double oldY = y;

        x += distance * cos(course* PI/180);
        y += distance * sin(course* PI/180);

        // v.1
        robotLineList.add(new RobotLine(oldX, oldY, x, y));
        // v.2
//        RobotLine robotLine = new RobotLine(oldX, oldY, x, y);
//        robotLineList.add(robotLine);
//        // v.3
//        RobotLine robotLine1 = new RobotLine();
//        robotLine1.setOldX(50);
//        robotLine1.setOldY(60);
//        robotLine1.setNewX(100);
//        robotLine1.setNewY(200);
//
//        robotLineList.add(robotLine1);

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

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
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
        return x;
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

    /* 8-типів
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
    String
    Date
    ...
    Robot
     */




}
