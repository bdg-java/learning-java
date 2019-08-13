package com.bdg.designpattern.factorypattern.proxy;

public class Main {
    public static void main(String[] args) {
        RealInternet internet = new RealInternet();
        internet.dosomething();
    }
}
