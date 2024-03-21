package ua.com.kneu.group201.lab3.decorator;

public class ComponentText implements Component {
    @Override
    public void draw() {
        System.out.println("draw text");
    }
}
