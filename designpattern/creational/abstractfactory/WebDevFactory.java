package com.gaurav.designpattern.creational.abstractfactory;

public class WebDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
