package com.bdg.Pattern.Creational.Factory_Method;

public class FactoryModeApp {

    public static void main(String[] args) {

        Creator[] creators = {new ConcreteCreator()};

        for (Creator creator : creators) {
            Product product = creator.factoryMethod();
            System.out.printf("Created \n", product.getClass());
        }
    }
}
