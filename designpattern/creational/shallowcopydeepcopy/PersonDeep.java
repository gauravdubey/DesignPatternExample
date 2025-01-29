package com.gaurav.designpattern.creational.shallowdeepcopy;

public class PersonDeep implements Cloneable {
    String name;
    AddressDeep address;

    public PersonDeep(String name, AddressDeep address) {
        this.name = name;
        this.address = address;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {

        PersonDeep personDeep = (PersonDeep) super.clone();
        personDeep.address = address.deepCopy();
        return personDeep;
    }

    public void display(){
        System.out.println("Name : " + name+ ", |  City : " + address.city);
    }
}
