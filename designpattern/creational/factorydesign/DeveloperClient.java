package com.gaurav.designpattern.creational.factorydesign;

public class DeveloperClientMain {

    public static void main(String[] args) {
        Employee employee= EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        int salary = employee.salary();
        System.out.print(salary);

        Employee webEmployee = EmployeeFactory.getEmployee("WEB DEVELOPER");
        int salaryWeb = webEmployee.salary();
        System.out.print(salaryWeb);
    }
}
