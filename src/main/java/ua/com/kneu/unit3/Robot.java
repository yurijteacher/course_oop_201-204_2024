package ua.com.kneu.unit3;

public class Robot {

    double x;
    double y = 0;
    double course = 0;
    double distance = 0;

    public static void main(String[] args) {

        Robot robot;
        robot = new Robot();

        Robot robot1 = new Robot();
        System.out.println(robot1.x + ", " + robot1.y + ", " + robot1.course + ", " + robot1.distance);

        System.out.println(robot1.toString());
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
