package ua.com.kneu.lecture3.creational.abstract_factory.hand;

import ua.com.kneu.lecture3.creational.abstract_factory.Hand;

public class SamsungHand implements Hand {
    @Override
    public void takeSomething() {
        System.out.println("Samsung Hand");
    }
}
