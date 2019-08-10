package com.bdg.agharibyan.designpatterns.creationalpatterns.factorymethod.viatransport;

public class Airplain implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by air in a container.");
    }
}
