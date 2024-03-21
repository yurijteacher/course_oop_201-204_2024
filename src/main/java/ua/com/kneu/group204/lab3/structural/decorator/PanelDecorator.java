package ua.com.kneu.group204.lab3.structural.decorator;

public class PanelDecorator extends Decorator{
    public PanelDecorator(Component component) {
        super(component);
    }

    @Override
    void afterDraw() {
        System.out.println("draw panel");
    }
}
