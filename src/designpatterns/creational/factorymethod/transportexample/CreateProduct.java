package designpatterns.creational.factorymethod.transportexample;

public abstract class CreateProduct {

    void create(){
        Transport transport = deliver();
        transport.deliver();
    }
    abstract Transport deliver();
}
