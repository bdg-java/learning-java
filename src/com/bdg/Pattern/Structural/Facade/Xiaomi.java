package com.bdg.Pattern.Structural.Facade;

public class Xiaomi implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Redmi 6");
    }

    @Override
    public void price() {
        System.out.println("150000 AMD");
    }
}
