package com.bdg.jsonHomework;

import java.util.ArrayList;
import java.util.List;

public class Svg_view implements JsonParse<Svg_view>{
    private String header;
    private List<String> items ;

    Svg_view(String header, List<String> items){
        this.header = header;
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }

    public String getHeader() {
        return header;
    }

    @Override
    public void parse() {

    }
}
