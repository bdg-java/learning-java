package com.bdg.enums;

public enum DayOfWeek {

    SUNDAY("enum.weekDay.monday") {
        public String shortName() {
            return "Sun";
        }
    },
    MONDAY("Monday") {
        public String shortName() {
            return "Mon";
        }
    },
    TUESDAY("Tuesday") {
        public String shortName() {
            return "Tue";
        }
    };
//    WEDNESDAY("Wednesday"),
//    THURSDAY("Thursday"),
//    FRIDAY("Friday"),
//    SATURDAY("Saturday");

    private String weekName;


    DayOfWeek(String weekName) {
        this.weekName = weekName;
    }

    public static DayOfWeek findByName(String enumName) {
        if (enumName == null) {
            return null;
        }
        return DayOfWeek.valueOf(enumName);
    }

    public String toString() {
        return this.weekName;
    }

    public String weekName() {
        return this.weekName;
    }

    public static String[] weekNames() {
        String[] names = new String[values().length];
        for (int i = 0; i < values().length; i++) {
            names[i] = values()[i].weekName;
        }
        return names;
    }

    public abstract String shortName();
}
