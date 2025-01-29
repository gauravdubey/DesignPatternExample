package com.gaurav.designpattern.creational.shallowdeepcopy;

public class AddressDeep {
    String city;

    public AddressDeep(String city) {
        this.city = city;
    }

    public AddressDeep deepCopy() {
        return new AddressDeep(this.city);
    }
}
