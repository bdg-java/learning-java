package com.designpatterns.abstractfactorymethod;

public class ModernTables implements Tables {
    private static final String DEF_NAME = "Modern Table...";
    private static final int DEF_COUNT = 5;

    @Override
    public void getTableName() {
        System.out.println(DEF_NAME);
    }

    @Override
    public int tablesLegsCount() {
        return DEF_COUNT;
    }
}
