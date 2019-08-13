package com.bdg.designpattern.factorypattern.proxy;

public class RealInternet implements WorkInternet {
    @Override
    public void dosomething() {
        System.out.println("This is realInternet ");
    }
}
