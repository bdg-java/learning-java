package com.designpatterns.factorymethod;

public interface Logistics {
    Transport createTransport();

    void planDelivery();
}
