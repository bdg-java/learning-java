package com.bdg.designpattern.factorypattern.abstractfactorypattern;

public class VictorianFurnitureFactory extends FurnitureFactory {

    @Override
    Chair CreateChair(String ChairType) {
        if(ChairType.equalsIgnoreCase("Victorian")) {
            return new VictorianChair();
        }
        return null;
    }

    @Override
    Table CreateTable(String TableType) {
        if(TableType.equalsIgnoreCase("Victorian")) {
            return new VictorianTable();
        }
        return null;
    }
}
