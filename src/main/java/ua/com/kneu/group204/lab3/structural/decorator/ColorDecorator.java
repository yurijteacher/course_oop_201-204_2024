package ua.com.kneu.group204.lab3.structural.decorator;

public class ColorDecorator extends Decorator{
    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    void afterDraw() {
        System.out.println("draw color");
    }
}
