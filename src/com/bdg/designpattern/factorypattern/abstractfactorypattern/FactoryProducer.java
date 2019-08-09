package com.bdg.designpattern.factorypattern.abstractfactorypattern;


public class FactoryProducer {
    public static FurnitureFactory getFactory(boolean victorian){
        if(victorian){
            return new VictorianFurnitureFactory();
        }else {
            return new ModernFurnitureFactory();
        }
    }
}
