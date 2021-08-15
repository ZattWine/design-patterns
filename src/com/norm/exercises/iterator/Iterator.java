package com.norm.exercises.iterator;

public interface Iterator {
    boolean hasNext();
    Product current();
    void next();
}
