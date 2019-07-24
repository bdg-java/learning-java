package com.bdg.jsonHomework.Widgets;

public class Image {
    private String src;
    private String name;
    private float hOffset;
    private float vOffset;
    private String alignment;

    Image(String src, String name, float hOffset, float vOffset, String alignment){
        this.src = src;
        this.name = name;
        this.hOffset = hOffset;
        this.vOffset = vOffset;
        this.alignment = alignment;
    }

    public String getName() {
        return name;
    }

    public float gethOffset() {
        return hOffset;
    }

    public float getvOffset() {
        return vOffset;
    }

    public String getSrc() {
        return src;
    }

    public String getAlignment() {
        return alignment;
    }

}
