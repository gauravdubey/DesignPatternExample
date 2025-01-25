package com.gaurav.designpattern.behavioral.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObserverMain {

    public static void main(String[] args) throws IOException {
        Subject channel = new YoutubeChannel();
        Subscriber gaurav = new Subscriber("Gaurav");
        Subscriber rahul = new Subscriber("Rahul");
        channel.subscribe(gaurav);
        channel.subscribe(rahul);
        channel.newVideoUploaded("Design Pattern");
        channel.unsubscribe(gaurav);
        channel.newVideoUploaded("Learn Java");
        
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Press 1 to upload Video");
            System.out.println("Press 2 create new Subscriber");
            System.out.println("Press 3 to exit");
            int c = Integer.parseInt(reader.readLine());

            if (c==1){
                System.out.println("Enter Video Title");
                String title = reader.readLine();
                channel.newVideoUploaded(title);
            }else if (c==2){
                System.out.println("Enter Subscriber Name");
                String name = reader.readLine();
                Subscriber subscriber = new Subscriber(name);
                channel.subscribe(subscriber);
            }else if (c==3){
                System.out.println("Thank you for using App!!");
                break;
            }else {
                System.out.println("Invalid Input");
            }
        }
    }
}
