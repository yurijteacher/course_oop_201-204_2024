package ua.com.kneu.group201.lib2.generalization;

public abstract class Robot {

    private double x=0;
    private double y=0;

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    abstract void dance();
}
