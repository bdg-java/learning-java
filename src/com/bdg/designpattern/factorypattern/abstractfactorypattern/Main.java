package com.bdg.designpattern.factorypattern.abstractfactorypattern;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory furniture = FactoryProducer.getFactory(false);
        Chair modern = furniture.CreateChair("Modern");
        Table modernTable = furniture.CreateTable("Modern");
        modern.sitOn();
        modern.hasLegs();
        modernTable.tableHasLegs();



        FurnitureFactory furniture2 = FactoryProducer.getFactory(true);
        Chair victorianChair = furniture2.CreateChair("Victorian");
        Table victorianTable = furniture2.CreateTable("Victorian");
        victorianChair.sitOn();
        victorianChair.hasLegs();
        victorianTable.tableHasLegs();



    }
}
