package com.norm.exercises.iterator;

public class Demo {
    public static void main(String[] args) {
        var history = new ProductHistory();
        history.push(new Product(1, "Product #1"));
        history.push(new Product(2, "Product #2"));
        history.push(new Product(3, "Product #3"));

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
