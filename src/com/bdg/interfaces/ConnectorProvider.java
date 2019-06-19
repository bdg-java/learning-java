package com.bdg.interfaces;

public class ConnectorProvider {

    public static DatabaseConnector getConnector() {
        return new OracleConnector();
    }
}
