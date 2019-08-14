package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaos;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Windows Button");
    }
}
