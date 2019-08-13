package designpatterns.creational.factorymethod.transportexample;

public class ShipProduct extends CreateProduct {
    @Override
    Transport deliver() {
        return new Ship();
    }
}
