package com.bdg.Pattern.Structural.Facade;

public class Samsung implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Samsung Galaxy S9");
    }

    @Override
    public void price() {
        System.out.println("250000 AMD");
    }
}
