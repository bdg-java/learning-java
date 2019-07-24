package com.bdg.jsonHomework.Menu;

public class Menu {
    private String id;
    private String value;
    Popup popup;


    Menu(String id, String value, Popup popup){
        this.id = id;
        this.value = value;
        this.popup = popup;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public Popup getPopup() {
        return popup;
    }


    public void setValue(String value) {
        this.value = value;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPopup(Popup popup) {
        this.popup = popup;
    }
}
