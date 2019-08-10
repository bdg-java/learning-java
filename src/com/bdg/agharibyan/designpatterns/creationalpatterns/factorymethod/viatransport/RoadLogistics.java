package com.bdg.agharibyan.designpatterns.creationalpatterns.factorymethod.viatransport;

public class RoadLogistics extends Logistics {
    @Override
    public Transport rentTransport() {
        return new Truck();
    }
}
