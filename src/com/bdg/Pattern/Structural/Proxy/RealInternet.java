package com.bdg.Pattern.Structural.Proxy;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connect " + serverHost);
    }
}
