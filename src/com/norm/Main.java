package com.norm;

import com.norm.memento.pratice.Document;
import com.norm.memento.pratice.DocumentHistory;

public class Main {

    public static void main(String[] args) {
        var document = makeDocument(
                "Content A",
                "Arial",
                18
        );
        var docHistory = new DocumentHistory();
        docHistory.push(document.createState());
        System.out.println("> Current Document State");
        System.out.println(document);

        document = makeDocument(
                "Content B",
                "Courier",
                22
        );
        docHistory.push(document.createState());
        System.out.println("> Current Document State");
        System.out.println(document);

        document = makeDocument(
                "Content C",
                "Roboto",
                32
        );
        System.out.println("> Current Document State");
        System.out.println(document);

        // Make Undo
        System.out.println("> UNDO");
        document.restore(docHistory.pop());
        System.out.println("> Current Document State");
        System.out.println(document);
    }

    private static Document makeDocument(String content, String fontName, float fontSize) {
        var document = new Document();
        document.setContent(content);
        document.setFontName(fontName);
        document.setFontSize(fontSize);
        return document;
    }
}
