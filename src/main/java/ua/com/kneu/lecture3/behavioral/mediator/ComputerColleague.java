package ua.com.kneu.lecture3.behavioral.mediator;

public class ComputerColleague extends Colleague{

//    private Mediator mediator;
    public ComputerColleague(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receiveRegNotification(Colleague colleague) {
        System.out.println("Реєстрація нового комп'ютера за назвою: " + colleague + ": отримано: " + this);
    }

    @Override
    public void receiveUnRegNotification(Colleague colleague) {
        System.out.println("Вихід з мережі комп'ютера за назвою: " + colleague + ": отримано: " + this);
    }
}
