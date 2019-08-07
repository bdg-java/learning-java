package com.bdg.designpattern;

import java.sql.ResultSet;

public class DatabaseExecuteTimeProxy implements Query {


    private Query original;

    public DatabaseExecuteTimeProxy(Query original) {
        this.original = original;
    }

    @Override
    public ResultSet executeQuery(String query) {
        long start = System.currentTimeMillis();
        ResultSet resultSet = this.original.executeQuery(query);
        long end = System.currentTimeMillis();

        System.out.println("EXECUTION TIME : " + (double)(end - start) / 1000 + " Second");
        return resultSet;
    }
}
