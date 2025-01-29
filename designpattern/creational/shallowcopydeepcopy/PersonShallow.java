package com.gaurav.designpattern.creational.shallowdeepcopy;

public class PersonShallow implements Cloneable {

    String name;
    Address address;

    public PersonShallow(String name, Address address) {
        this.name = name;
        this.address = address;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display(){

        System.out.println("Name : " + name+ ", |  City : " + address.city);
    }
}
