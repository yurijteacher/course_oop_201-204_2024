package ua.com.kneu.group203.example1;

public class RobotExt extends Robot {

    private double totalDistance = 0;
    public RobotExt(double x, double y, double course, double distance) {
        super(x, y, course, distance);
    }

    @Override
    public void forward() {
        super.forward();
        totalDistance += getDistance();
    }

    @Override
    public String toString() {
        return "RobotExt{" +
                "totalDistance=" + totalDistance + ", " +
                super.toString() +
                '}';
    }

    public static void main(String[] args) {

        RobotExt robotExt = new RobotExt(1,2,3,4);

        System.out.println(robotExt);

        robotExt.setCourse(90);
        robotExt.setDistance(100);

        robotExt.forward();
        System.out.println(robotExt);

        robotExt.setCourse(90);
        robotExt.setDistance(100);

        robotExt.forward();
        System.out.println(robotExt);


        for (RobotLine line : robotExt.getRobotLineList()){
            System.out.println(line);
        }

        robotExt.getRobotLineList()
                .stream()
                .forEach(e->{
            System.out.println(e);
        });



//        Robot robot = new Robot();
//        System.out.println(robot.toString());
//
//        robot.setX(10);
//        robot.setY(10);
//        robot.setCourse(45);
//        robot.setDistance(100);
//
//        System.out.println(robot);
//
//        System.out.println(robot.getX() + ", " + robot.getY() + ", " + robot.getCourse() + ", " + robot.getDistance());
//
//        Robot robot1 = new Robot(1);
//        System.out.println(robot1);
//        Robot robot2 = new Robot(1,2);
//        Robot robot3 = new Robot(1,2,3); //distance = 0
//        Robot robot4 = new Robot(4,3,2,1);
//
//        System.out.println(robot2);
//        System.out.println(robot3);
//        System.out.println(robot4);
//
//        robot.setX(0);
//        robot.setY(0);
//
//        robot.setDistance(100);
//        robot.setCourse(60);
//        robot.forward();
//        System.out.println(robot);
//
//        robot.setCourse(90);
//        robot.setDistance(100);
//        robot.forward();
//        System.out.println(robot);

    }
}
