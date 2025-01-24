package com.gaurav.designpattern.creational.prototype;

public class PrototypeMain {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is Prototype Design Pattern");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadImportantData();
        System.out.println(networkConnection);

        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
            NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection3);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
