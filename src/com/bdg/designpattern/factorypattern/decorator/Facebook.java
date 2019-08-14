package com.bdg.designpattern.factorypattern.decorator;

public class Facebook extends BaseDecorator{
    Facebook(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Facebook notifier");
    }
}
