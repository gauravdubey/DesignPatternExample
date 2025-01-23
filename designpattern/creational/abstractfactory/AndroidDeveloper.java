package com.gaurav.designpattern.creational.abstractfactory;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        System.out.println("I am Android developer");
        return "ANDROID DEVELOPER";
    }
}
