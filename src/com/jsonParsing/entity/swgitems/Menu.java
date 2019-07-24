package com.jsonParsing.entity.swgitems;

import java.util.Arrays;

public class Menu {
    private String header;
    private Items[] items;

    public Menu(String header, Items[] items) {
        this.header = header;
        this.items = items;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String toString() {
        return "Menu: " + this.header + ", " + Arrays.toString(this.items);
    }
}
