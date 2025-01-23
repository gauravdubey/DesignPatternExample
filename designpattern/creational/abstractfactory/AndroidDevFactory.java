package com.gaurav.designpattern.creational.abstractfactory;

public class AndroidDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
