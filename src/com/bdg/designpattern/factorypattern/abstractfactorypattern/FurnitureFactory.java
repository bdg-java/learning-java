package com.bdg.designpattern.factorypattern.abstractfactorypattern;

 public abstract class  FurnitureFactory {
    abstract Chair CreateChair(String ChairType);
    abstract Table  CreateTable(String TableType);

}
