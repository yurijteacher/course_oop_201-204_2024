package ua.com.kneu.group202.example1;

public class RobotExt extends Robot {

    private double totalDistance = 0;

    @Override
    public void forward() {
        super.forward();
        totalDistance += getDistance();
    }

    public RobotExt() {}

    public RobotExt(double x, double y, double course, double distance) {
        super(x, y, course, distance);
    }

    public static void main(String[] args) {

        RobotExt robotExt = new RobotExt();
        System.out.println(robotExt);

        RobotExt robotExt1 = new RobotExt(100,100,90,1000);
        System.out.println(robotExt1);

        robotExt1.forward();

        System.out.println(robotExt1);

        robotExt1.setCourse(45);
        robotExt1.setDistance(2000);

        robotExt1.forward();

        System.out.println(robotExt1);

//        Robot robot = new Robot();
//        System.out.println(robot);
//
//        robot.setX(10);
//        robot.setY(20);
//        robot.setCourse(45);
//        robot.setDistance(1000);
//
//        System.out.println(robot);
//        System.out.println("x=" + robot.getX() + ", y=" + robot.getY());


        for (RobotLine el : robotExt1.getRobotLines()){
            System.out.println(el);
        }


    }

    @Override
    public String toString() {
        return "RobotExt{" +
                "totalDistance=" + totalDistance +", " +
                super.toString() +
                '}';
    }
}

