package com.bdg.interfaces;

import com.bdg.User;
import com.bdg.interfaces.databaseconnection.Group;

public class PostgresConnector implements DatabaseConnector{

    public DatabaseConnection connect() {
        return new DatabaseConnection();
    }

    @Override
    public void save(Group group) {

    }

    @Override
    public void save(User user) {

    }
}
