package com.bdg.interfaces.databaseconnection;

import com.bdg.User;
import com.bdg.interfaces.DatabaseConnection;
import com.bdg.interfaces.Persistent;

public class UserPersistentService implements Persistent {
    @Override
    public void save(User user) {

    }

    @Override
    public void save(Group group) {

    }

    @Override
    public DatabaseConnection connect() {
        return null;
    }
}
