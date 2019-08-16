package com.bdg.Pattern.Structural.Facade;

public class Iphone implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("IPhone 7 Plus");
    }

    @Override
    public void price() {
        System.out.println("200000 AMD");
    }
}
