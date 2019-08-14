package com.designpatterns.abstractfactorymethod;

public class VictorianTables implements Tables {
    private final static int DEF_COUNT = 8;
    private static final String DEF_NAME = "Victorian Table...";

    @Override
    public void getTableName() {
        System.out.println(DEF_NAME);
    }

    @Override
    public int tablesLegsCount() {
        return DEF_COUNT;
    }
}
