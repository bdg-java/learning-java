package com.bdg.enums;

public class DayOfWeekNotFoundException extends RuntimeException {

    private static final String DEFAULT_NOT_FOUND_MESSAGE = "Day Of Week with name %s not found";
    private String message;

    public DayOfWeekNotFoundException(String weekName) {
        this.message = String.format(DEFAULT_NOT_FOUND_MESSAGE, weekName);
    }

    public String getMessage() {
        return this.message;
    }
}
