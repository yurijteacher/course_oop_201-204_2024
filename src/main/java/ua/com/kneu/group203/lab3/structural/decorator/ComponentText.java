package ua.com.kneu.group203.lab3.structural.decorator;

public class ComponentText implements Component{
    @Override
    public void draw() {
        System.out.println("draw text");
    }
}
