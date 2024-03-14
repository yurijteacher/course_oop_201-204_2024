package ua.com.kneu.group202.lab2.generalization;

public abstract class Robot {

    private double x;
    private double y;


    public abstract void forward();

    public abstract void dance();

    public abstract void calc();

    public Robot() {
    }

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
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
