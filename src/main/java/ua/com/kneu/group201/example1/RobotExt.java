package ua.com.kneu.group201.example1;

public class RobotExt extends Robot {

    private double totalDistance = 0;

    @Override
    public void forward(){
        super.forward();
        totalDistance +=getDistance();
    }

    public RobotExt() {}

    public RobotExt(double x, double y, double course, double distance) {
        super(x, y, course, distance);
    }

    @Override
    public String toString() {
        return "RobotExt{" + super.toString() +","+ " totalDistance=" +totalDistance + "} ";
    }

    // psvm
    public static void main(String[] args) {

        RobotExt robotExt = new RobotExt(1,1,90,100);

        robotExt.forward();

        System.out.println(robotExt);

        robotExt.setCourse(45);
        robotExt.setDistance(100);

        robotExt.forward();

        System.out.println(robotExt);

        for (RobotLine line : robotExt.getRobotLines()){
            System.out.println(line);
        }

    }


}
