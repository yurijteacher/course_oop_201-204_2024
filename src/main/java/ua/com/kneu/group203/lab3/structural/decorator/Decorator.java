package ua.com.kneu.group203.lab3.structural.decorator;

public abstract class Decorator implements Component {

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }
    abstract void afterDraw();

}
