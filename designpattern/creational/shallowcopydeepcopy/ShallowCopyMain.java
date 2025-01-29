package com.gaurav.designpattern.creational.shallowdeepcopy;

public class ShallowCopyMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Shallow Copy Example :");

        Address address = new Address("New York");
        PersonShallow person = new PersonShallow("John", address);

        // Creating Shallow Copy
        PersonShallow personCopy = (PersonShallow) person.clone();

        // Change the city of the personCopy
        personCopy.address.city="San Francisco";

        // Display the original and copied person
        System.out.println("Original Person:");
        person.display();
        System.out.println("Copied Person:");
        personCopy.display();
    }
}
