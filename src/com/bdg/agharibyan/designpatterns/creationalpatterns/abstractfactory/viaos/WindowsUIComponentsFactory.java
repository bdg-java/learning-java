package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaos;

public class WindowsUIComponentsFactory implements UIComponentsFactory{

    @Override
    public Button createButton() {   // error em unenum WindowsButton yntrelis
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
