package com.gaurav.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Observer> subscribers= new ArrayList<>();

    @Override
    public void subscribe(Observer obj) {
        subscribers.add(obj);
    }

    @Override
    public void unsubscribe(Observer obj) {
        subscribers.remove(obj);
    }

    @Override
    public void newVideoUploaded(String title) {
        for (Observer ob : subscribers) {
            ob.notified(title);
        }
    }
}
