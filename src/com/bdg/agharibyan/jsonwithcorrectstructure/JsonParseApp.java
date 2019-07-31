package com.bdg.agharibyan.jsonwithcorrectstructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonParseApp {
    public static void main(String[] args) throws IOException {
        String jsonFilePath = "c:/Users/User/IdeaProjects/learning-java/resource/thumbnail.json";

        final BufferedReader br = new BufferedReader(new FileReader(jsonFilePath), 1024); //chem haskanum

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
