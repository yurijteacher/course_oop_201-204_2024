package ua.com.kneu.unit4;

public class RobotPublic {
    public double x = 0;
    public double y = 0;
    public double course = 0;
    public double distance = 0;


    public static void main(String[] args) {

        RobotPublic robotPublic = new RobotPublic();

        robotPublic.x = 5;
        robotPublic.y = 10;
        robotPublic.course = 100;
        robotPublic.distance = 45;

    }

    @Override
    public String toString() {
        return "RobotPublic{" +
                "x=" + x +
                ", y=" + y +
                ", course=" + course +
                ", distance=" + distance +
                '}';
    }
}
