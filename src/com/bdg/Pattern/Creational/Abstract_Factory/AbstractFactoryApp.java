package com.bdg.Pattern.Creational.Abstract_Factory;

import static com.bdg.Pattern.Creational.Abstract_Factory.FactoryType.THREE_D_SHAPE_FACTORY;
import static com.bdg.Pattern.Creational.Abstract_Factory.FactoryType.TWO_D_SHAPE_FACTORY;

public class AbstractFactoryApp {


    public static void main(String[] args) {

    AbstractFactory factory = FactoryProvider.getfactory(TWO_D_SHAPE_FACTORY);
    if (factory == null) {
        System.out.println("Factory for given name doesn't exist.");
        System.exit(1);
    }
    GeometricShape shape = factory.getShape(ShapeType.LINE);
    if (shape != null) {
        shape.draw();
    } else {
        System.out.println("Shape with given name doesn't exist.");
    }
    factory = FactoryProvider.getfactory(THREE_D_SHAPE_FACTORY);
    if (factory == null) {
        System.out.println("Factory for given name doesn't exist.");
        System.exit(1);
    }
    shape = factory.getShape(ShapeType.SPHERE);
    if (shape != null) {
        shape.draw();
    } else {
        System.out.println("Shape with given name doesn't exist.");
    }
}
}
