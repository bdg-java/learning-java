package com.bdg.designpattern.factorypattern.abstractfactorypattern;

public class ModernFurnitureFactory extends FurnitureFactory {

    @Override
    Chair CreateChair(String ChairType) {
        if(ChairType.equalsIgnoreCase("Modern")) {
        return new ModernChair();
        }
        return null;

    }

    @Override
    Table CreateTable(String TableType) {
        if(TableType.equalsIgnoreCase("Modern")) {
            return new Moderntable();
        }
        return null;
    }
}
