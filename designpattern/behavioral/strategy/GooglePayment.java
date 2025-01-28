package com.gaurav.designpattern.behavioral.strategy;

public class GooglePayment implements PaymentStrategy{

    private final String phoneNumber;

    public GooglePayment(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " USD using Google Pay link to Phone : " + phoneNumber);
    }
}
