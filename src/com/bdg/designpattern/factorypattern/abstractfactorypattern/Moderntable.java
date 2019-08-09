package com.bdg.designpattern.factorypattern.abstractfactorypattern;

public class Moderntable implements Table {
    @Override
    public void tableHasLegs() {
        System.out.println("Modern Table");
    }
}
