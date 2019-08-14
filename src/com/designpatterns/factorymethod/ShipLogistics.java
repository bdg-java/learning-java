package com.designpatterns.factorymethod;

public class ShipLogistics implements Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }

    @Override
    public void planDelivery() {
        System.out.println("Plan Delivery by Ship");
    }
}
