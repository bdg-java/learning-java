package com.bdg.designpattern.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows button");
    }
}
