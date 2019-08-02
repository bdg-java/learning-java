package jsonparser;


import jsonparser.address.Address;
import jsonparser.address.AddressJsonParser;
import jsonparser.color.Color;
import jsonparser.color.ColorJsonParser;
import jsonparser.image.Thumbnail;
import jsonparser.image.ThumbnailJsonParser;
import jsonparser.image.ThumbnailValidator;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
//        String string = ReadFileToString.readLineByLine("c:/Users/VivoBook/Documents/learning-java/src/jsonparser/files/color-value.json");
//        ColorJsonParser colorJsonParser = new ColorJsonParser();
//        Color color = colorJsonParser.parse(string);
//        System.out.println(color);
       // System.out.println(string);
//
//       ReadFileToString readFileToString = new ReadFileToString();
//
//       readFileToString.start();


        String string = ReadFileToString.read("c:/Users/VivoBook/Documents/learning-java/src/jsonparser/files/thumbnail.json");
        System.out.println(string);
        ThumbnailJsonParser thumbnailJsonParser = new ThumbnailJsonParser();
            Thumbnail thumbnail =  thumbnailJsonParser.parse(string);
        System.out.println(thumbnail);




    }
}
