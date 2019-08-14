package com.designpatterns.abstractfactorymethod;

public class abstractfactoryApplication {
    public static void main(String[] args) {
        Chairs v = (Chairs) new VictorianFurnitureFabrica().getFurnichure(FurnitureType.CHAIRS);
        v.getChairsName();
        Tables m = (Tables) new ModernFurnitureFabrica().getFurnichure(FurnitureType.TABLES);
        m.getTableName();
    }
}
