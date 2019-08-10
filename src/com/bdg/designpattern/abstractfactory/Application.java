package com.bdg.designpattern.abstractfactory;


public class Application {

    public static void main(String[] args) {
        UIComponentsFactory uiFactory = UIComponentFactoryMethod.getUIFactory(OSType.WINDOWS);
        Button button = UIComponentFactoryMethod.getUIFactory(OSType.WINDOWS).createButton();
        button.render();
        UIComponentFactoryMethod.getUIFactory(OSType.LINUX).createWindow().render();
    }
}
