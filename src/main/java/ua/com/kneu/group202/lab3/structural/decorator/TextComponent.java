package ua.com.kneu.group202.lab3.structural.decorator;

public class TextComponent implements Component{
    @Override
    public void draw() {
        System.out.println("draw text");
    }
}
