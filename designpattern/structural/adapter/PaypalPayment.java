package com.gaurav.designpattern.structural.adapter;

public class PaypalPayment {

    public void sendPayment(int amount){
        System.out.println("Paid "+amount+" USD using Paypal");
    }
}
