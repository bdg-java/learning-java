package com.bdg.Dayofweek;

public class DayOfWeekNotFoundException extends RuntimeException {
    private static final  String DEFAULT_NOT_FOUND_MESSAGE = "Day of week with name %s not found";
    private String message;
    public DayOfWeekNotFoundException(String weekName) {

        this.message = String.format(DEFAULT_NOT_FOUND_MESSAGE, weekName);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
