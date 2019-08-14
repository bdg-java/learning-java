package com.bdg.designpattern.factorypattern.decorator;

public class SMS extends BaseDecorator {
    SMS(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("SMS Notifier");
    }
}
