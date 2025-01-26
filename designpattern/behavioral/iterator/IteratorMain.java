package com.gaurav.designpattern.behavioral.iterator;

public class IteratorMain {

    public static void main(String[] args) {
        System.out.println("Iterator Design Pattern : ");
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Gaurav", "123"));
        userManagement.addUser(new User("Rahul", "124"));
        userManagement.addUser(new User("Gagan", "125"));
        userManagement.addUser(new User("Prakash", "126"));

        MyIterator iterator=userManagement.getIterator();
        while (iterator.hasNext()){
            User user=(User)iterator.next();
            System.out.println(user.getName()+ ": "+ user.getUserId());
        }
    }
}
