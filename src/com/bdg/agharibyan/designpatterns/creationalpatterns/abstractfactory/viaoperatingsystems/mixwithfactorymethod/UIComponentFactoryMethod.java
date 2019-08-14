package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems.mixwithfactorymethod;

import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems.LinuxUIComponentsFactory;
import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems.OSType;
import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems.UIComponentsFactory;
import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaoperatingsystems.WindowsUIComponentsFactory;

import java.util.EnumMap;
import java.util.Map;

public class UIComponentFactoryMethod {

    private static Map<OSType, UIComponentsFactory> componentsFactoryMap;

    static {
        componentsFactoryMap = new EnumMap<>(OSType.class);
        componentsFactoryMap.put(OSType.WINDOWS, new WindowsUIComponentsFactory());
        componentsFactoryMap.put(OSType.LINUX, new LinuxUIComponentsFactory());
    }

    private UIComponentFactoryMethod(){
        throw new AssertionError();
    }

    public static UIComponentsFactory getUIFactory(OSType type){
        return componentsFactoryMap.get(type);
    }
}
