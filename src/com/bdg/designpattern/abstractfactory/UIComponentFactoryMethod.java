package com.bdg.designpattern.abstractfactory;

import java.util.EnumMap;
import java.util.Map;

public final class UIComponentFactoryMethod {

    private final static Map<OSType, UIComponentsFactory> componentMapping;

    static {
        componentMapping = new EnumMap<>(OSType.class);
        componentMapping.put(OSType.LINUX, new LinuxUIComponentsFactory());
        componentMapping.put(OSType.WINDOWS, new WindowsUIComponentsFactory());
    }

    private UIComponentFactoryMethod() {
        throw new AssertionError();
    }

    public static UIComponentsFactory getUIFactory(final OSType type) {
        return componentMapping.get(type);
    }
}
