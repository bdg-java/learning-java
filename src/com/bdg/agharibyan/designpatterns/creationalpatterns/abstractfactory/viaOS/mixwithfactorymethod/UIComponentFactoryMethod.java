package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaOS.mixwithfactorymethod;

import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaOS.LinuxUIComponentsFactory;
import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaOS.OSType;
import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaOS.UIComponentsFactory;
import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaOS.WindowsUIComponentsFactory;

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
