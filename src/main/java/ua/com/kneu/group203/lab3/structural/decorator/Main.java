package ua.com.kneu.group203.lab3.structural.decorator;

public class Main {

    public static void main(String[] args) {

        Component component = new PanelDecorator(new ColorDecorator(new PanelDecorator(new ComponentText())));
        component.draw();
    }
}
