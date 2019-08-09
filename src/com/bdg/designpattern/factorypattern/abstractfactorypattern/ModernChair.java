package com.bdg.designpattern.factorypattern.abstractfactorypattern;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Modern chair *** hasLegs Method ***");
    }

    @Override
    public void sitOn() {
        System.out.println("Modern chair *** sitOn Method***");
    }
}
