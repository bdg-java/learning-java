package com.bdg.designpattern.factorypattern;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by land");
    }
}
