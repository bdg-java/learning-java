package com.bdg.hr;

public class Profession {

    private String professionName;

    public Profession(String professionName) {
        this.professionName = professionName;
    }

    public String getProfessionName() {
        return this.professionName;
    }

    public String toString(){
        return  "professionName: " + professionName;
    }
}
