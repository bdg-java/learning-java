package com.bdg.designpattern;

import java.sql.ResultSet;

public interface Query {
    ResultSet executeQuery(String query);
}
