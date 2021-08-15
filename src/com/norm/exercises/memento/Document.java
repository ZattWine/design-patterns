package com.norm.exercises.memento;

public class Document {
    private String content;
    private String fontName;
    private float fontSize;

    public DocumentState createState() {
        return new DocumentState(content, fontName, fontSize);
    }

    public void restore(DocumentState state) {
        content = state.getContent();
        fontName = state.getFontName();
        fontSize = state.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public float getFontSize() {
        return fontSize;
    }

    public void setFontSize(float fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
