package designpatterns.creational.factorymethod.transportexample;

public class Ship implements Transport {
    @Override
    public Transport deliver() {
        System.out.println("deliver ship");
        return new Ship();
    }
}
