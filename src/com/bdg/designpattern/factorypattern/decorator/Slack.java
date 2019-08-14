package com.bdg.designpattern.factorypattern.decorator;

public class Slack extends BaseDecorator {
    Slack(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Slack notifier");
    }
}
