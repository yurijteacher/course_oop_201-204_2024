package ua.com.kneu.lecture3.behavioral.state;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        UI ui = new UI(player);
        ui.init();

    }
}
