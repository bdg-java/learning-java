package com.bdg.designpattern.factorypattern.decorator;

public class BaseDecorator implements Notifier {
    Notifier notifier;
    BaseDecorator(Notifier notifier){
        this.notifier = notifier;
    }
    @Override
    public void send() {
        this.notifier.send();
    }
}
