package ua.com.kneu.unit4;

public class RobotPrivate {

    private double x;
    private double y = 0;
    private double course = 0;
    private double distance = 0;

    public static void main(String[] args) {

        RobotPrivate robotPrivate = new RobotPrivate();

        System.out.println(robotPrivate.x + "," + robotPrivate.y + ", " + robotPrivate.course + ", " + robotPrivate.distance);

    }

    @Override
    public String toString() {
        return "RobotPrivate{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }
}
