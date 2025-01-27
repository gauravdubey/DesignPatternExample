package com.gaurav.designpattern.structural.facade;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier is ON");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier volume set to " + volume);
    }

    public void off() {
        System.out.println("Amplifier is OFF");
    }
}
