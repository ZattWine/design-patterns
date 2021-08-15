package com.norm.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private final String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public BrowseHistoryIterator createIterator() {
        return new BrowseHistoryIterator(this);
    }

    static class BrowseHistoryIterator implements Iterator {

        private final BrowseHistory history;
        private int index;

        public BrowseHistoryIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean handNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

}
