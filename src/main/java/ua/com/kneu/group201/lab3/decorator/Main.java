package ua.com.kneu.group201.lab3.decorator;

public class Main {

    public static void main(String[] args) {

        Component component = new ColorDecorator(new PanelDecorator(new ColorDecorator(new ComponentText())));
        component.draw();


    }

}
