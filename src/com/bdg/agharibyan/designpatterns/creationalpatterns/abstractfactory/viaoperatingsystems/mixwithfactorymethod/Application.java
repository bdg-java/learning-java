package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems.mixwithfactorymethod;

import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems.Button;
import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems.OSType;
import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems.UIComponentsFactory;

public class Application {

    public static void main(String[] args) {
        UIComponentsFactory uiComponentsFactory = UIComponentFactoryMethod.getUIFactory(OSType.WINDOWS);
        Button button = uiComponentsFactory.createButton();
        button.render();

        UIComponentFactoryMethod.getUIFactory(OSType.LINUX).createButton().render();

        UIComponentFactoryMethod.getUIFactory(OSType.WINDOWS).createWindow().render();

        UIComponentFactoryMethod.getUIFactory(OSType.LINUX).createWindow().render();
    }
}