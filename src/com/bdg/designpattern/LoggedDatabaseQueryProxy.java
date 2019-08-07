package com.bdg.designpattern;

import java.sql.ResultSet;

public class LoggedDatabaseQueryProxy implements Query {

    private Query original;

    public LoggedDatabaseQueryProxy(Query original) {
        this.original = original;
    }

    @Override
    public ResultSet executeQuery(String query) {
        System.out.println("Start executing query");
        ResultSet resultSet = this.original.executeQuery(query);
        System.out.println("End executing query");
        return resultSet;
    }
}
