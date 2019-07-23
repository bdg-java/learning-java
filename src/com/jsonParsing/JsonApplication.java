package com.jsonParsing;


import com.jsonParsing.entity.Address;
import com.jsonParsing.enums.Country;
import com.jsonParsing.service.AddressJsonParser;

import java.util.Arrays;

public class JsonApplication {
    public static void main(String[] args) {
        JsonParser<Address> js = new AddressJsonParser();
        System.out.println(js.jsonParsing("C:\\Users\\Gary\\Desktop\\JavaTask\\address.json"));

    }
}
