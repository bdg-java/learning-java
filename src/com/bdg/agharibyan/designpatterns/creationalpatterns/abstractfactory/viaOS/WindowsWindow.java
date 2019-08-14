package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaOS;

public class WindowsWindow implements Window {

    @Override
    public void render() {
        System.out.println("Windows Window");
    }
}
