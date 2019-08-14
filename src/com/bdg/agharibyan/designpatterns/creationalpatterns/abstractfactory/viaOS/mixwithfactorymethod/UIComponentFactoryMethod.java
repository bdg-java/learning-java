package com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaos.mixwithfactorymethod;

import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaos.LinuxUIComponentsFactory;
import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaos.OSType;
import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaos.UIComponentsFactory;
import com.bdg.agharibyan.designpatterns.creationalpatterns.abstractfactory.viaos.WindowsUIComponentsFactory;

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
