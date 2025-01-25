package com.gaurav.designpattern.behavioral.observer;

public interface Subject {

    void subscribe(Observer obj);
    void unsubscribe(Observer obj);
    void newVideoUploaded(String title);

}
