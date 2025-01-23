package com.gaurav.designpattern.creational.factorydesign;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.print("\nGetting Web Developer Salary : ");
        return 40000;
    }
}
