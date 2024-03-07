package ua.com.kneu.unit4;

public class Test {

    public static void main(String[] args) {

        RobotPrivate robotPrivate = new RobotPrivate();

//        robotPrivate.x
//        robotPrivate.y

        RobotPublic robotPublic = new RobotPublic();
        robotPublic.x = 10;
        robotPublic.y = 20;

        RobotProtected robotProtected = new RobotProtected();
        robotPublic.x = 5;

        RobotProtected robotProtected1 = new RobotProtected();
        robotProtected1.x = 5;

    }


}
