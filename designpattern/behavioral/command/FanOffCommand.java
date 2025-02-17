package com.gaurav.designpattern.behavioral.command;

public class FanOffCommand implements Command {

    private final Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.stop();
    }
}
