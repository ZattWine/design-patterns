package com.norm;

import com.norm.iterator.BrowseHistory;
import com.norm.iterator.Iterator;

public class Main {

    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.handNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
