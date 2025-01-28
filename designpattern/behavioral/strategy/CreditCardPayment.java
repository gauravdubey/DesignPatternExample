package com.gaurav.designpattern.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy{

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " USD using Credit Card: " + cardNumber);
    }
}
