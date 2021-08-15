package com.norm.exercises.command;

public class VideoEditor {
    private String text;
    private float contrast = 0.5f;

    public void removeText() {
        text = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public float getContrast() {
        return contrast;
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
    }

    @Override
    public String toString() {
        return "VideoEditor{" +
                "text='" + text + '\'' +
                ", contrast=" + contrast +
                '}';
    }
}
