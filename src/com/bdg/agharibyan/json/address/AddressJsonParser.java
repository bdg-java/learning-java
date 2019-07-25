package com.bdg.agharibyan.json.address;

import com.bdg.agharibyan.json.JsonParser;
import com.bdg.agharibyan.json.ReadFileToString;

public class AddressJsonParser implements JsonParser<Address> {

    @Override
    public Address parse(String jsonContent) {
        jsonContent = ReadFileToString.usingBufferedReader("c:/Users/User/Desktop/jsons/address.json");
        return null;
    }
}
