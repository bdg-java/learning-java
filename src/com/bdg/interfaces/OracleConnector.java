package com.bdg.interfaces;


import com.bdg.interfaces.databaseconnection.Group;

public class OracleConnector implements DatabaseConnector {

    public DatabaseConnection connect() {
        return new DatabaseConnection();
    }

    @Override
    public void save(Group group) {

    }
}
