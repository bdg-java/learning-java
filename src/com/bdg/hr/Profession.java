package com.bdg.hr;

public class Profession {

    private String professionName;

    public Profession(String professionName) {
        this.professionName = professionName;
    }

    public String name() {
        return this.professionName;
    }

    public boolean equals(Object profession) {
        if (profession == this) {
            return true;
        }
        Profession that = (Profession) profession;
        return that.name().equals(this.name());
    }



//    public String getProfession() {
//        return this.professionName;
//    }
}
