package com.gaurav.designpattern.structural.adapter;

public class StripeAdapter implements PaymentProcessor {
    private final StripePayment stripePayment;

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void pay(int amount) {
        stripePayment.makePayment(amount * 100);
    }
}
