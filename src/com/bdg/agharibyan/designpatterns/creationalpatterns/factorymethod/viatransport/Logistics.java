package com.bdg.agharibyan.designpatterns.creationalpatterns.factorymethod.viatransport;

public abstract class Logistics {

    public abstract Transport rentTransport();

    public void deliver(){
        Transport newTransport = rentTransport();
        newTransport.deliver();
    }
}
