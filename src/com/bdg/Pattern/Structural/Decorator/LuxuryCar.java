package com.bdg.Pattern.Structural.Decorator;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding features of Luxury Car");
    }
}
