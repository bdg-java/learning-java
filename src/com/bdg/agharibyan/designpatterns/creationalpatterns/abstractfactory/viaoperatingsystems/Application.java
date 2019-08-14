package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems;

import java.util.EnumMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        Map<OSType, UIComponentsFactory> componentsFactoryMap = new EnumMap<>(OSType.class);
        componentsFactoryMap.put(OSType.LINUX, new LinuxUIComponentsFactory());
        componentsFactoryMap.put(OSType.WINDOWS, new WindowsUIComponentsFactory());

        UIComponentsFactory uiComponentsFactory = componentsFactoryMap.get(OSType.WINDOWS);
        Button button = uiComponentsFactory.createButton();
        button.render();

        componentsFactoryMap.get(OSType.LINUX).createButton().render();

        componentsFactoryMap.get(OSType.WINDOWS).createWindow().render();

        componentsFactoryMap.get(OSType.LINUX).createWindow().render();
    }

}

