package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viafurniture;

public class Application {

    public static void main(String[] args) {

        ModernFurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        VictorianFurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();

        modernFurnitureFactory.createChair().render();
        modernFurnitureFactory.createCoffeTable().render();
        modernFurnitureFactory.createSofa().render();

        victorianFurnitureFactory.createChair().render();
        victorianFurnitureFactory.createCoffeTable().render();
        victorianFurnitureFactory.createSofa().render();
    }
}
