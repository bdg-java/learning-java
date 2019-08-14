package com.designpatterns.abstractfactorymethod;

import java.util.EnumMap;
import java.util.Map;

public class VictorianFurnitureFabrica implements FurnitureFabrica {
    private final static Map<FurnitureType, Furniture> furnitureMapping;

    static {
        furnitureMapping = new EnumMap<>(FurnitureType.class);
        furnitureMapping.put(FurnitureType.CHAIRS, new VictorianChairs());
        furnitureMapping.put(FurnitureType.TABLES, new VictorianTables());
    }

    @Override
    public Furniture getFurnichure(FurnitureType f) {
        return furnitureMapping.get(f);
    }
}
