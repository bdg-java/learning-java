package com.bdg.Pattern.Creational.Factory_Method;

public class ConcreteCreator extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}
