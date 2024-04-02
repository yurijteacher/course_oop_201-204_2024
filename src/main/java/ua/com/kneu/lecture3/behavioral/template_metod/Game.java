package ua.com.kneu.lecture3.behavioral.template_metod;

public interface Game {

    void init();
    void start();
    void end();

    default void play(){
        init();
        start();
        end();
    }

}
