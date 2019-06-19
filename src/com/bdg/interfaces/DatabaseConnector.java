package com.bdg.interfaces;

import com.bdg.User;
import com.bdg.interfaces.databaseconnection.Group;

public interface DatabaseConnector {

    DatabaseConnection connect();
}
