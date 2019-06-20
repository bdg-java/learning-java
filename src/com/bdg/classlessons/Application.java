package com.bdg.classlessons;

import com.bdg.inheritance.Developer;
import com.bdg.interfaces.OracleConnector;

public class Application {

    public static void main(String[] args) {

        Developer developer = new Developer("xxxx", 333, "java");

        developer.getName();

        OracleConnector connector = new OracleConnector();
    }
}
