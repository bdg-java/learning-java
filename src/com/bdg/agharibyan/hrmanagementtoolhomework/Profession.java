package com.bdg.agharibyan.hrmanagementtoolhomework;

public class Profession {

    private String professionName;

    public Profession(String professionName){
        this.professionName = professionName;
    }

    public String name(){
        return this.professionName;
    }

    public boolean equals(Object proffesion){
        if(proffesion == this){
            return true;
        }
        Profession that = (Profession)proffesion;
        return that.name().equals(this.name());
    }
}
