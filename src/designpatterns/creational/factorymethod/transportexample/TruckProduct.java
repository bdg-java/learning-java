package designpatterns.creational.factorymethod.transportexample;

public class TruckProduct extends CreateProduct {
    @Override
    Transport deliver() {
        return new Truck();
    }
}
