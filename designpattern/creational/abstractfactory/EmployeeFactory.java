package com.gaurav.designpattern.creational.abstractfactory;


public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}
