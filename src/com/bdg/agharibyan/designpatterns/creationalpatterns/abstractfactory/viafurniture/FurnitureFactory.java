package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viafurniture;

public interface FurnitureFactory {

    Chair createChair();
    CoffeeTable createCoffeTable();
    Sofa createSofa();

}
