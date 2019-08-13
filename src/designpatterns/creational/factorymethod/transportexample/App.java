package designpatterns.creational.factorymethod.transportexample;

import designpatterns.creational.factorymethod.transportexample.Ship;
import designpatterns.creational.factorymethod.transportexample.Transport;
import designpatterns.creational.factorymethod.transportexample.Truck;

public class App {

    public static void main(String[] args) {
        CreateProduct transport = new ShipProduct();
        Transport a = transport.deliver();
        transport = new TruckProduct();
        a = transport.deliver();
    }
}
