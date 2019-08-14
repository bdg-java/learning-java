package com.bdg.designpattern.factorypattern.decorator;

public class BaseNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("base Notifier");

    }
}
