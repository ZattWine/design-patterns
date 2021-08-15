package com.norm.memento.pratice;

public class DocumentState {

    private final String content;
    private final String fontName;
    private final float fontSize;

    public DocumentState(String content, String fontName, float fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public float getFontSize() {
        return fontSize;
    }
}
