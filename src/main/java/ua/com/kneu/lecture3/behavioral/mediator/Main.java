package ua.com.kneu.lecture3.behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new NetworkMediator();

        ComputerColleague colleague1 = new ComputerColleague(mediator, "Comp1");
        mediator.register(colleague1);

        ComputerColleague colleague2 = new ComputerColleague(mediator, "Comp2");
        mediator.register(colleague2);

        ComputerColleague colleague3 = new ComputerColleague(mediator, "Comp3");
        mediator.register(colleague3);

        mediator.unregister(colleague3);
    }
}
