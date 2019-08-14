package com.designpatterns.abstractfactorymethod;

public class ModernChairs implements Chairs {
    private static final String DEF_NAME = "Modern Chairs...";
    private final static int DEF_COUNT = 4;

    @Override
    public void getChairsName() {
        System.out.println(DEF_NAME);
    }

    @Override
    public int chairLegCount() {
        return DEF_COUNT;
    }
}
