package com.gaurav.designpattern.behavioral.strategy;

public class PaypalPayment implements PaymentStrategy{

    private  final String email;

    public PaypalPayment(String email){
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " USD using Paypal: " + email);
    }
}
