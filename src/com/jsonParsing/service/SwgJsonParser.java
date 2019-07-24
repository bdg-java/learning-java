package com.jsonParsing.service;

import com.jsonParsing.JsonParser;
import com.jsonParsing.entity.swgitems.Items;
import com.jsonParsing.entity.swgitems.Menu;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class SwgJsonParser implements JsonParser<Menu> {
    @Override
    public Menu jsonParsing(String filePath) {
        Menu newmenu = null;
        try {
            FileReader reader = new FileReader(filePath);
            JSONParser parser = new JSONParser();

            JSONObject jsonObject = (JSONObject) parser.parse(reader);

            JSONObject jsMenu = (JSONObject) jsonObject.get("menu");
            String header = jsMenu.get("header").toString();
            JSONArray arritems = (JSONArray) jsMenu.get("items");
            Items[] items = new Items[arritems.size()];
            for (int i = 0; i < arritems.size(); i++) {
                JSONObject obj = (JSONObject) arritems.get(i);
                String id = "";
                if (obj.get("id") != null)
                    id = obj.get("id").toString();

                String label = "";
                if (obj.get("label") != null)
                    label = obj.get("label").toString();

                items[i] = new Items(id, label);
            }
            newmenu = new Menu(header, items);

        } catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
        return newmenu;
    }
}

