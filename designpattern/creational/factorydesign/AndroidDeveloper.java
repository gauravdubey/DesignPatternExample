package com.gaurav.designpattern.creational.factorydesign;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.print("Getting Android Developer Salary : ");
        return 50000;
    }
}
