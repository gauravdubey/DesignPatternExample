package com.gaurav.designpattern.structural.adapter;

public class PaypalAdapter implements PaymentProcessor {
    private final PaypalPayment paypalPayment;

    public PaypalAdapter(PaypalPayment paypalPayment) {
        this.paypalPayment = paypalPayment;
    }

    @Override
    public void pay(int amount) {
        paypalPayment.sendPayment(amount);
    }
}
