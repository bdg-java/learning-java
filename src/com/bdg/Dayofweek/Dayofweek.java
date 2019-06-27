package com.bdg.Dayofweek;

import java.time.DayOfWeek;

public enum Dayofweek {


    SUNDAY("Sunday"){
        public String shortName(){
            return "Sun";
        }
    },
    MONDAY("Monday"){
        public String shortName(){
            return "Mon";
        }
    },
    THUESDAY("Thuesday"){
        public String shortName(){
            return "Thues";
        }
    };

    //    WEDNESDAY("Wednesday"),
//    THURSDAY("Thursday"),
//    FRIDAY("Friday"),
//    SATURDAY("Saturday");*/

    private String weekName;

    Dayofweek (String weekName){
        this.weekName = weekName;
    }

    public static Dayofweek findByName(String enumName){
       if(enumName == null){
           return null;
       }
       return Dayofweek.valueOf(enumName);

    }
    public static Dayofweek find(String weekName) {
        Dayofweek found = null;

        for (Dayofweek value : values()) {
            if (value.weekName == weekName) {
                found = value;
            }
        }
        throw new DayOfWeekNotFoundException(weekName);
    }
    public String toString(){
        return this.weekName;
    }

    public String weekName(){
        return this.weekName;
    }


    public static String[] weeName(){
    String[] name = new String[values().length];
    for(int i = 0; i<name.length; i++){
        name[i] = values()[i].weekName;
    }
    return name;
    }
    public abstract String shortName();
}
