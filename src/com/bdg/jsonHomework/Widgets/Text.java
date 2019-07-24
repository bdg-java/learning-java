package com.bdg.jsonHomework.Widgets;

public class Text {
    private String data;
    private float size;
    private String style;
    private String name;
    private float hOffset;
    private float vOffset;
    private String alignment;
    private String onMouseUp;


    Text(String data, float size, String style, String name, float hOffset, float vOffset, String alignment, String onMouseUp){
        this.data = data;
        this.size = size;
        this.style = style;
        this.name = name;
        this.hOffset = hOffset;
        this.vOffset = vOffset;
        this.alignment = alignment;
        this.onMouseUp = onMouseUp;
    }

    public float getSize() {
        return size;
    }

    public String getAlignment() {
        return alignment;
    }

    public float getvOffset() {
        return vOffset;
    }

    public float gethOffset() {
        return hOffset;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }

    public String getStyle() {
        return style;
    }

    public String getOnMouseUp() {
        return onMouseUp;
    }
}
