package ua.com.kneu.group203.lab3.structural.decorator;

public class ColorDecorator extends Decorator{
    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    void afterDraw() {
        System.out.println("draw color");
    }

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
}
