package com.bdg.Pattern.Creational.Factory_Method;

public abstract class Creator implements Product{
    
    Product p = factoryMethod();

    protected abstract Product factoryMethod();

}
