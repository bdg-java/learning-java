package com.bdg.agharibyan.designpatterns.creationalpatterns.factorymethod.viatransport;

public class AirLogistics extends Logistics {
    @Override
    public Transport rentTransport() {
        return new Airplain();
    }
}
