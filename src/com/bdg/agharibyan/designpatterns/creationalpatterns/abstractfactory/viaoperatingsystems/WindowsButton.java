package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Windows Button");
    }
}
