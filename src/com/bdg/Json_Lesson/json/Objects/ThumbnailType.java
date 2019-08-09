package com.bdg.Json_Lesson.json.Objects;

public class ThumbnailType {

//        DONUT("donut");

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

    private static ThumbnailType[] values() {
        return new ThumbnailType[0];
    }
}
