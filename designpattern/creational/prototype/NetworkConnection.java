package com.gaurav.designpattern.creational.prototype;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String importantData;


    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void loadImportantData() throws InterruptedException {
        this.importantData="This is very Important Data";
        Thread.sleep(5000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip=" + ip +
                ", importantData='" + importantData + '\'' +
                '}';
    }

}
