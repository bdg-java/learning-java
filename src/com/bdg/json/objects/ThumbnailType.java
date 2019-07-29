package com.bdg.json.objects;


/**
 * @author William Arustamyan
 */


public enum ThumbnailType {

    DONUT("donut");

    private final String typeName;

    ThumbnailType(final String typeName) {
        this.typeName = typeName;
    }


    public static ThumbnailType findByName(final String typeName) {
        for (final ThumbnailType tt : values()) {
            if (tt.typeName.equalsIgnoreCase(typeName)) {
                return tt;
            }
        }
        return null;
    }
}
