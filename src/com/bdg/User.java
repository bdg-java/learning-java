package com.bdg;

import java.util.Arrays;

public class User {
    public char[] name = {'a', 'b', 'c'};

    public User(String name, String surname) {


    }

    public String toString() {
        return Arrays.toString(name);
    }
}
