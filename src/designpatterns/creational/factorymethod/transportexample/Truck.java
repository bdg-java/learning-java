package designpatterns.creational.factorymethod.transportexample;

public class Truck implements Transport {
    @Override
    public Transport deliver() {
        System.out.println("deliver truck");
        return new Truck();
    }
}
