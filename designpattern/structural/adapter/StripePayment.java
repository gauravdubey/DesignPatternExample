package com.gaurav.designpattern.structural.adapter;

public class StripePayment {

    public void makePayment(int amountInCent) {
        System.out.println("Paid " + amountInCent / 100 + " USD using Stripe");
    }
}
