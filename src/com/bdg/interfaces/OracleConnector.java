package com.bdg.interfaces;


public class OracleConnector implements DatabaseConnector {

    public DatabaseConnection connect() {
        return new DatabaseConnection();
    }
}
