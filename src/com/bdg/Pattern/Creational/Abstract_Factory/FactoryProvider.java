package com.bdg.Pattern.Creational.Abstract_Factory;

public class FactoryProvider {

    public static AbstractFactory getfactory (FactoryType factoryType){
        if (factoryType.TWO_D_SHAPE_FACTORY == factoryType){
            return new TwoDShapeFactory();
        } else if (factoryType.THREE_D_SHAPE_FACTORY ==factoryType){
            return new ThreeDShapeFactory();
        }
        return null;
    }


}
