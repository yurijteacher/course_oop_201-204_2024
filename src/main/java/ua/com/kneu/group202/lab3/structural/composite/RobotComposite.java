package ua.com.kneu.group202.lab3.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class RobotComposite implements Robot{

    List<Robot> robotList = new ArrayList<>();

    public void addComposite(Robot robot){
        robotList.add(robot);
    }

    public void deleteComposite(Robot robot){
        robotList.remove(robot);
    }

    @Override
    public void active() {
        for (Robot robot : robotList){
            robot.active();
        }
    }
}
