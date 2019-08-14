package com.designpatterns.abstractfactorymethod;

public class VictorianChairs implements Chairs {
    private final static int DEF_COUNT = 3;
    private static final String DEF_NAME = "Victorian Chairs...";

    @Override
    public void getChairsName() {
        System.out.println(DEF_NAME);
    }

    @Override
    public int chairLegCount() {
        return DEF_COUNT;
    }
}
