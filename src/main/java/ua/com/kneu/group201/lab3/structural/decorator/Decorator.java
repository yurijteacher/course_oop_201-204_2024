package ua.com.kneu.group201.lab3.structural.decorator;

public abstract class Decorator implements Component {

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }

    public abstract void afterDraw();
}
