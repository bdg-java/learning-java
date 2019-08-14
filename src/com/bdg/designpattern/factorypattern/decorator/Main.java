package com.bdg.designpattern.factorypattern.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("************ SMS and Base Notifier *********** ");
     Notifier notifier = new SMS(new BaseNotifier());
     notifier.send();
        System.out.println("************ SMS, Facebook and Base Notifier *********** ");
     Notifier notifier1 = new Facebook(notifier);
     notifier1.send();
        System.out.println("************ SMS, Facebook, Slack and Base Notifier *********** ");
        Notifier notifier2 = new Slack(notifier1);
     notifier2.send();


    }
}
