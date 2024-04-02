package ua.com.kneu.lecture3.behavioral.template_metod;

public class Basketball implements Game{
    @Override
    public void init() {
        System.out.println("int basketball");
    }

    @Override
    public void start() {
        System.out.println("start basketball");
    }

    @Override
    public void end() {
        System.out.println("end basketball");
    }
}
