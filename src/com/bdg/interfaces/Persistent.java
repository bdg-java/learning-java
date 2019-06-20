package com.bdg.interfaces;

import com.bdg.User;
import com.bdg.interfaces.databaseconnection.Group;

public interface Persistent extends DatabaseConnector {

    void save(User user);

    void save(Group group);
}
