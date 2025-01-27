package com.gaurav.designpattern.behavioral.command;

public class HomeAutomationSystemMain {

    public static void main(String[] args) {
        System.out.println("\nCommand Design Pattern : ");

        // Create the receiver objects
        Light light = new Light();
        Fan fan = new Fan();

        //Command
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command fanOn = new FanOnCommand(fan);
        Command fanOff = new FanOffCommand(fan);

        // Invoker
        RemoteControl remoteControl = new RemoteControl();

        // Test Light
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton(); // Light is ON

        remoteControl.setCommand(lightOff);
        remoteControl.pressButton(); // Light is OFF

        // Test Fan

        remoteControl.setCommand(fanOn);
        remoteControl.pressButton(); // Fan is ON

        remoteControl.setCommand(fanOff);
        remoteControl.pressButton(); // Fan is OFF

    }
}
