package com.json.parser;

import com.json.objects.Image;
import com.json.objects.ThumbnailImage;
import com.json.objects.ThumbnailInstance;
import com.json.objects.ThumbnailType;

public class ThumbnailParser<T extends ThumbnailInstance> implements JsonParser<T> {
    @Override
    public T parse(String content) {
        String tag = "";
        String id = "";
        String type = "";
        String name = "";
        String imageContent = "";
        String thumbnailContent = "";
        content = content.replace("\t", "");

        if (content.contains("id")) {
            tag = "\"id\": ";
            id = getValue(0, content.indexOf(tag) + tag.length(), content);
        }

        if (content.contains("type")) {
            tag = "\"type\": ";
            type = getValue(0, content.indexOf(tag) + tag.length(), content).replace("\"", "");
        }
        if (content.contains("name")) {
            tag = "\"name\": ";
            name = getValue(0, content.indexOf(tag) + tag.length(), content);
        }

        if (content.contains("image")) {
            tag = "\"image\":{";
            imageContent = getArrayasString(0, content.indexOf(tag) + tag.length(), content);
        }
        if (content.contains("thumbnails")) {
            tag = "\"thumbnails\":{";
            thumbnailContent = getArrayasString(0, content.indexOf(tag) + tag.length(), content);
        }

        ThumbnailInstance thumbinstance = new com.json.objects.ThumbnailInstance(id, ThumbnailType.findByName(type), name, createImage(imageContent), new ThumbnailImage(createImage(thumbnailContent)));
        return (T) thumbinstance;
    }

    private String getValue(int startposition, int indexoftag, String content) {
        int lastposition = content.indexOf(",", indexoftag);
        if (lastposition == -1) {
            lastposition = content.indexOf("}", indexoftag);
        }
        return content.substring(indexoftag, lastposition);
    }

    private String getArrayasString(int startposition, int indexoftag, String content) {
        int lastposition = content.indexOf("}", indexoftag);
        return content.substring(indexoftag, lastposition + 1);

    }

    private Image createImage(String content) {
        String tag = "";
        tag = "\"url\": ";
        String url = getValue(0, content.indexOf(tag) + tag.length(), content);
        tag = "\"width\": ";
        int width = Integer.valueOf(getValue(0, content.indexOf(tag) + tag.length(), content).replace("\"", ""));
        tag = "\"height\": ";
        int height = Integer.valueOf(getValue(0, content.indexOf(tag) + tag.length(), content).replace("\"", ""));
        Image img = new Image(url, width, height);
        return img;
    }
}
