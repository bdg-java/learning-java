package com.bdg.agharibyan.json.colorvalue;

import com.bdg.agharibyan.json.JsonParser;
import com.bdg.agharibyan.json.ReadFileToString;

public class ColoredValueParser implements JsonParser <ColorValue> {

    @Override
    public ColorValue parse(String jsonContent) {
        jsonContent = ReadFileToString.usingBufferedReader("c:/Users/User/Desktop/jsons/color-value.json");
        return null;
    }
}
