package com.bdg.Exception;

public class YourOldExceaption extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Your old is %s, It is not enought";
    public String message;
    public YourOldExceaption(String age) {
        this.message = String.format(DEFAULT_MESSAGE, age);

    }
    public String getMessage() {
        return message;
    }

}
