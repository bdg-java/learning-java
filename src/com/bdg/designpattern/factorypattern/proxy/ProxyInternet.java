package com.bdg.designpattern.factorypattern.proxy;

public class ProxyInternet extends RealInternet {
    @Override
    public void dosomething() {
        System.out.println("this is ProxyInternet");
        super.dosomething();
    }
}
