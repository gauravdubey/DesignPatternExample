package com.gaurav.designpattern.behavioral.iterator;

import java.util.List;

public class MyIteratorImpl implements MyIterator{

    List<User> userList;
    int length;
    int position=0;

    public MyIteratorImpl(List<User>list){
        this.userList=list;
        this.length=list.size();
    }

    @Override
    public boolean hasNext() {
        return position < length;
    }

    @Override
    public Object next() {
        User user=userList.get(position);
        position+=1;
        return user;
    }
}
