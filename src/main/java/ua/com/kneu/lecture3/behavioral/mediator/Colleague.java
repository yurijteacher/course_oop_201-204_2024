package ua.com.kneu.lecture3.behavioral.mediator;

public abstract class Colleague {

    private Mediator mediator;
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void receiveRegNotification(Colleague colleague);
    public abstract void receiveUnRegNotification(Colleague colleague);

}
