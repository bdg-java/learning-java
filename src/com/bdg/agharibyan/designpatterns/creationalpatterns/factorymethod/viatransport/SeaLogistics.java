package com.bdg.agharibyan.designpatterns.creationalpatterns.factorymethod.viatransport;

public class SeaLogistics extends Logistics{
    @Override
    public Transport rentTransport() {
        return new Ship();
    }
}
