package ua.com.kneu.group201.lab3.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class RobotComposite implements Robot{

    private List<Robot> robotList = new ArrayList<>();

    public void addComposite(Robot robot){
        robotList.add(robot);
    }

    public void remove(Robot robot){
        robotList.remove(robot);
    }


    @Override
    public void action() {
        for (Robot el : robotList){
            System.out.println(el);
        }
    }
}
