package ua.com.kneu.unit5;

public class Robot {

    private double x = 0;
    private double y = 0;
    private double course = 0;
    private double distance = 0;

    public Robot() {}

    public Robot(double x) {
        this.x = x;
    }

//    public Robot(double y) {
//        this.y = y;
//    }

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


//    public void Robot(double x, double y, double course, double distance) {
//        this.x = x;
//        this.y = y;
//        this.course = course;
//        this.distance = distance;
//    }

    // використання методів set
//    public void setX(double x1){
//        x = x1;
//    }


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
