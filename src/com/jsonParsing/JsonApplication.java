package com.jsonParsing;


import com.jsonParsing.entity.address.Address;
import com.jsonParsing.entity.swgitems.Menu;
import com.jsonParsing.service.AddressJsonParser;
import com.jsonParsing.service.SwgJsonParser;

public class JsonApplication {
    public static void main(String[] args) {
        JsonParser<Address> js = new AddressJsonParser();
        System.out.println(js.jsonParsing("C:\\Users\\Gary\\Desktop\\JavaTask\\address.json"));

        JsonParser<Menu> jm = new SwgJsonParser();
        System.out.println(jm.jsonParsing("C:\\Users\\Gary\\Desktop\\JavaTask\\svg-view.json"));

    }
}
