package com.gaurav.designpattern.behavioral.command;

public class FanOnCommand implements Command{

    private final Fan fan;


    public FanOnCommand(Fan fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.start();
    }
}
