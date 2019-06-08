package com.bdg.agharibyan.umlhomework;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate birthDate;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean isBirthday(){
        return LocalDate.now().equals(this.birthDate);
    }
    //verjin toghy chem haskanum vonc e ashkhatum
}
