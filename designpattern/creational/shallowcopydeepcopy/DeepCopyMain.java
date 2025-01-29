package com.gaurav.designpattern.creational.shallowdeepcopy;

public class DeepCopyMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Deep Copy Example");

        AddressDeep address = new AddressDeep("New York");
        PersonDeep person = new PersonDeep("John", address);

        // Creating deep copy of Person
        PersonDeep personDeep = (PersonDeep) person.clone();

        // Change the city of the personDeep
        personDeep.address.city = "San Francisco";

        // Display the original and deep copied person
        System.out.println("Original Person:");
        person.display();
        System.out.println("Deep Copied Person:");
        personDeep.display();
    }

}
