package com.bdg.designpattern;

public class Executor {

    public static void main(String[] args) {
        String queryStr = "Select * from person";
        Query query = new DatabaseExecuteTimeProxy(
                new LoggedDatabaseQueryProxy(new DatabaseQuery())
        );
        query.executeQuery(queryStr);

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();


    }
}
