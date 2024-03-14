package ua.com.kneu.group203.lab2.generalization;

public class RobotExt2 extends RobotExt {

    private String info;

    public RobotExt2(double x, double y) {
        super(x, y);
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
