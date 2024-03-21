package ua.com.kneu.group202.lab3.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Component component = new PanelDecorator(new ColorDecorator(new PanelDecorator(new TextComponent())));
        component.draw();
    }
}
