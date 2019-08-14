package com.designpatterns.factorymethod;

public class factoryMethodApplication {
    public static void main(String[] args) {
        Transport roadL = new RoadLogistics().createTransport();
        roadL.deliver();
        Transport shipL = new ShipLogistics().createTransport();
        shipL.deliver();


    }

}
