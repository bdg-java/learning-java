package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems;

public class LinuxUIComponentsFactory implements UIComponentsFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}
