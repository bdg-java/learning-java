package com.bdg.agharibyan.json.colorvalue;

import com.bdg.agharibyan.json.JsonParser;

public class ColorValue {

    private String color;
    private String value;

    public ColorValue(String color, String value){
        this.color = color;
        this.value = value;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getValue(){
        return this.value;
    }

    public void setValue(String value){
        this.value = value;
    }
}
