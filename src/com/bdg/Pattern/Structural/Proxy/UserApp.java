package com.bdg.Pattern.Structural.Proxy;

public class UserApp {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("facebook.com");
            internet.connectTo("ddd.com");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
