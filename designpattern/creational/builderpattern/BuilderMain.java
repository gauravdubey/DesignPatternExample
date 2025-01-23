package com.gaurav.designpattern.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {

        // Using Builder to get the object in a single line of code and
        User user = new User.UserBuilder()
                .setUserId("User123")
                .setUserName("Gaurav")
                .setEmailId("gaurav@gmail.com")
                .build();
        System.out.println(user.toString());

        // Using static method
        User user1 = User.UserBuilder.getUserBuilder()
                .setUserId("User134")
                .setUserName("Rahul")
                .build();
        System.out.println(user1.toString());
    }
}
