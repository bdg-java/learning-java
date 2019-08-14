package com.designpatterns.factorymethod;

public class RoadLogistics implements Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }

    @Override
    public void planDelivery() {
        System.out.println("Plan Delivery by Truck");
    }
}
