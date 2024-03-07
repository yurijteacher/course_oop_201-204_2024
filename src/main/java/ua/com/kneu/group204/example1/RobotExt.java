package ua.com.kneu.group204.example1;

public class RobotExt extends Robot {

    private double totalDistance = 0;

    @Override
    public void forward(){
        super.forward();
        totalDistance += getDistance();
    }

    public RobotExt() {
    }

    public RobotExt(double x, double y, double course, double distance) {
        super(x, y, course, distance);
    }


    public static void main(String[] args) {
        RobotExt robotExt = new RobotExt(100,100,45,200);
        System.out.println(robotExt);

        robotExt.forward();

        System.out.println(robotExt);

        robotExt.setCourse(90);
        robotExt.setDistance(100);

        robotExt.forward();

        System.out.println(robotExt);


        for(RobotLine line : robotExt.getRobotLines()){
            System.out.println(line);
        }

    }

    @Override
    public String toString() {
        return "RobotExt{" +
                "totalDistance=" + totalDistance +" ," +
                super.toString() +
                '}';
    }
}
