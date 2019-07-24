package com.jsonParsing.entity.swgitems;

public class Items {
    private String id;
    private String label;

    public Items(String id, String label) {
        this.id = id;
        this.label = label;
    }

    public String getId() {
        return this.id;
    }

    public String getLabel() {
        return this.label;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toString() {
        return "[ " + this.id + " -  " + this.label + " ]";
    }


}
