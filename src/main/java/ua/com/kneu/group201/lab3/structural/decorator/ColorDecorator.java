package ua.com.kneu.group201.lab3.structural.decorator;

public class ColorDecorator extends Decorator{
    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("draw color");
    }
}
