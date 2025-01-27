package com.gaurav.designpattern.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern : ");

        // Stripe Payment
        StripePayment stripePayment=new StripePayment();
        PaymentProcessor stripeAdapter=new StripeAdapter(stripePayment);
        stripeAdapter.pay(800);

        // Paypal Payment
        PaypalPayment paypalPayment = new PaypalPayment();
        PaymentProcessor paypalAdapter = new PaypalAdapter(paypalPayment);
        paypalAdapter.pay(500);
    }
}
