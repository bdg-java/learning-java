package jsonparser.image;

import jsonparser.JsonParser;
import jsonparser.Validator;

import java.util.LinkedList;
import java.util.List;

public class ThumbnailJsonParser implements JsonParser<Thumbnail> {

    private String id;
    private String type;
    private String name;
    private double originalWidth;
    private double thumbnailWidth;
    private double originalHeight;
    private double thumbnailHeight;
    private String originalUrl;
    private String thumbnailUrl;



    @Override
    public Thumbnail parse(String jsonContent) {

        ThumbnailValidator thumbnailValidator = new ThumbnailValidator(null);
        if (thumbnailValidator.isValid(jsonContent)) {

            String[] string = jsonContent.split(",");
            for (String s : string) {
                String[] pairs = s.split(":");
                if (pairs[0].contains("id")) id = pairs[1];
                if (pairs[0].contains("type")) type = pairs[1];
                if (pairs[0].contains("name")) name = pairs[1];
                setHeight(pairs[0], pairs[1]);
                setWidth(pairs[0], pairs[1]);
                setUrl(pairs[0], pairs[1]);
            }
            Image image = new Image(originalUrl, originalWidth, originalHeight);
            return new Thumbnail(id, type, name,
                    image,
                    new ThumbnailImage(new Image(thumbnailUrl, thumbnailWidth, thumbnailHeight))
            );
        }


        return null;
    }


    private void setWidth(String key, String value) {

        if (key.contains("width")) {
            if (originalWidth == 0) {
                originalWidth = Double.valueOf(value);
            } else {
                thumbnailWidth = Double.valueOf(value);
            }
        }
    }

    private void setHeight(String key, String value) {

        if (key.contains("height")) {
            String parsed = value.replace("}", "");
            if (originalHeight == 0) {
                originalHeight = Double.valueOf(parsed);
            } else {
                thumbnailHeight = Double.valueOf(parsed);
            }
        }
    }

    private void setUrl(String key, String value) {

        if (key.contains("url")) {
            if (originalUrl == null) {
                originalUrl = value;
            } else {
                thumbnailUrl = value;
            }
        }
    }


}
