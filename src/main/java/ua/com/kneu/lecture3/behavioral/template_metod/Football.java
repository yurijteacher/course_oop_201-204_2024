package ua.com.kneu.lecture3.behavioral.template_metod;

public class Football implements Game{
    @Override
    public void init() {
        System.out.println("init football");
    }

    @Override
    public void start() {
        System.out.println("start football");
    }

    @Override
    public void end() {
        System.out.println("end football");
    }
}
