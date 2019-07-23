package com.jsonParsing.service;


import com.jsonParsing.JsonParser;
import com.jsonParsing.entity.Address;
import com.jsonParsing.entity.PhoneNumber;
import com.jsonParsing.enums.Country;
import com.jsonParsing.enums.CountryCode;
import com.jsonParsing.enums.PhoneType;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AddressJsonParser implements JsonParser<Address> {
    @Override
    public Address jsonParsing(String filePath) {
        Address newAddress = null;
        try {
            FileReader reader = new FileReader(filePath);
            JSONParser parser = new JSONParser();

            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            String country = jsonObject.get("country").toString();
            String street = jsonObject.get("street").toString();

            JSONArray arrphone = (JSONArray) jsonObject.get("phoneNumbers");
            PhoneNumber[] p = new PhoneNumber[arrphone.size()];
            for (int i = 0; i < arrphone.size(); i++) {
                JSONObject obj = (JSONObject) arrphone.get(i);
                String number = obj.get("number").toString();
                String phoneType = obj.get("phoneType").toString();
                String countryCode = obj.get("countryCode").toString();
                p[i] = new PhoneNumber(CountryCode.valueOf(countryCode), number, PhoneType.valueOf(phoneType));
            }
            newAddress = new Address(Country.valueOf(country), street, p);
        } catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
        return newAddress;
    }
}
