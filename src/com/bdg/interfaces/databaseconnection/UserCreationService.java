package com.bdg.interfaces.databaseconnection;

import com.bdg.User;
import com.bdg.interfaces.Persistent;

public class UserCreationService {

    private Persistent connector = new UserPersistentService();

    public User createUser(String name, String surname) {
        User user = new User(name, surname);
        connector.save(user);
        return user;
    }
}
