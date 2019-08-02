package jsonparser.color;

import jsonparser.JsonParser;

import java.util.Arrays;
import java.util.stream.Stream;

public class ColorJsonParser implements JsonParser<Color> {
    @Override
    public Color parse(String jsonContent) {
        String[] splited = jsonContent.split(",");
        String color;
        String value;
        for (String s : splited) {
          String[] pair =  s.split(":");
          if(pair[0] == "color"){
              color = pair[1];
          }else if(pair[0] == "value"){
              value = pair[1];
          }else {
              return  null;
          }
        }
        System.out.println();

      //  System.out.println(jsonContent.lines());
       // System.out.println(jsonContent);
        return null;
    }

}
