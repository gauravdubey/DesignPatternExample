package com.gaurav.designpattern.creational.singleton;

public class SingletonPatternMain {

    public static void main(String[] args) {
        System.out.println("This is Singleton Design Pattern");
        Network.getNetworkInstance().checkNetwork();
    }
}


/**
 * Class which need to make Singleton
 */
class Network{
    private static Network mNetwork;
    private Network(){}
    public static Network getNetworkInstance(){
        if (mNetwork==null){
            synchronized (Network.class){
                mNetwork=new Network();
            }
        }
        return mNetwork;
    }

    public void checkNetwork(){
        System.out.println("\n Checking the network status");
    }
}
