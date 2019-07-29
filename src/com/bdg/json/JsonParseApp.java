package com.bdg.json;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author William Arustamyan
 */


public class JsonParseApp {


    public static void main(String[] args) throws IOException {
        String jsonFilePath = "/Users/warustamyan/development/workspace/bdg/learning-java/resource/thumbnail.json";

        final BufferedReader br = new BufferedReader(new FileReader(jsonFilePath), 1024);

        String line = br.readLine();
        final StringBuilder jsonContent = new StringBuilder(line);
        while (line != null) {
            line = br.readLine();
            jsonContent.append(line);
        }
        br.close();

        System.out.println(jsonContent.toString());

    }
}
