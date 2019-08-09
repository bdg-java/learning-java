package com.bdg.designpattern.factorypattern;

public class RoadLogistics extends Logistics {
    @Override
    public Transport CreateTransport() {
            return new Truck();
    }
}
