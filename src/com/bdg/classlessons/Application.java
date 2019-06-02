package com.bdg.classlessons;

public class Application {

    public static void main(String[] args) {

        char[] password = {'3', 'y'};
        boolean isValidPassword = Validator.validatePassword(password, User.validPasswordSize);

        System.out.println(isValidPassword);
    }
}
