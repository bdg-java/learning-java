package com.bdg.collectionsimpl;

import java.util.Random;

public class User{

    public String username;
    public int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String toString() {
        return "{ Username : " + this.username + ", Age : " + this.age + " }";
    }

    public int hashCode() {
        return this.username.hashCode();
    }

    public boolean equals(Object o) {
        if (o instanceof User) {
            return this.username.equals(((User) o).username) && this.age == ((User) o).age;
        }
        return false;
    }

}
