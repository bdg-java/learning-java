package com.bdg.Pattern.Creational.Abstract_Factory;

public abstract class AbstractFactory {
    abstract GeometricShape getShape(ShapeType name);
}
