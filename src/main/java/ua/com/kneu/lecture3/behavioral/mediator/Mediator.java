package ua.com.kneu.lecture3.behavioral.mediator;

public interface Mediator {

    void register(Colleague colleague);
    void unregister(Colleague colleague);

}
