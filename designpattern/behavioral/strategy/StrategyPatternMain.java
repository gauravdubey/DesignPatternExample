package com.gaurav.designpattern.behavioral.strategy;

public class StrategyPatternMain {

    public static void main(String[] args) {
        System.out.println("Strategy Design Pattern: ");
        ShoppingCart cart = new ShoppingCart();

        //Pay using credit card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100); // Paid 100 USD using credit card

        // Pay using Paypal

        cart.setPaymentStrategy(new PaypalPayment("gauravdubey@gmail.com"));
        cart.checkout(150); // Paid 150 USD using Paypal

        // Pay using Google Pay
        cart.setPaymentStrategy(new GooglePayment("9876543210"));
        cart.checkout(200); // Paid 200 USD using Google Pay
    }
}
