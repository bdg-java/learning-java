package com.bdg.designpattern;

import java.sql.ResultSet;

public class DatabaseQuery implements Query {

    public ResultSet executeQuery(String query) {
        realDBExecuteMethod(query);
        return null;
    }

    private void realDBExecuteMethod(String query) {
        System.out.println("------- executing db query { " + query + " } -------");
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
