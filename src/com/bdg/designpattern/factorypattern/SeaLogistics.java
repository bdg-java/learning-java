package com.bdg.designpattern.factorypattern;

public class SeaLogistics extends Logistics {
    @Override
    public Transport CreateTransport() {
        return new Ship();
    }
}
