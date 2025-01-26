package com.gaurav.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

    private List<User>list=new ArrayList<>();

    public void addUser(User user){
        list.add(user);
    }
    public User getUser(int index){
        return list.get(index);
    }

    public MyIterator getIterator(){
        return new MyIteratorImpl(list);
    }
}
