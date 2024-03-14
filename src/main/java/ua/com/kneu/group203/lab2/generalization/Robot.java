package ua.com.kneu.group203.lab2.generalization;

public class Robot {

    private double x;
    private double y;

    public Robot() {
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Robot(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
