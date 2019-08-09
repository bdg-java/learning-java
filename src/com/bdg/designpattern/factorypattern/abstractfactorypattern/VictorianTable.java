package com.bdg.designpattern.factorypattern.abstractfactorypattern;

public class VictorianTable implements Table {
    @Override
    public void tableHasLegs() {
        System.out.println("Victorian Table");
    }
}
