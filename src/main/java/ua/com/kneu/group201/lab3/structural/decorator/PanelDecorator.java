package ua.com.kneu.group201.lab3.structural.decorator;

public class PanelDecorator extends Decorator{
    public PanelDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("draw panel");
    }
}
