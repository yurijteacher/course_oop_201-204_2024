package ua.com.kneu.group204.lab3.structural.decorator;

public class Main {

    public static void main(String[] args) {

        Component component = new ColorDecorator(new PanelDecorator(new ColorDecorator(new PanelDecorator(new ColorDecorator(new ComponentText())))));

        component.draw();


    }
}
