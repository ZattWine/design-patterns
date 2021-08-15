package com.norm.exercises.iterator;

public class ProductHistory {
    private Product[] products = new Product[10];
    private int count;

    public void push(Product product) {
        products[count++] = product;
    }

    public Product pop() {
        return products[--count];
    }

    public ProductIterator createIterator() {
        return new ProductIterator(this);
    }

    static class ProductIterator implements Iterator {

        private final ProductHistory history;
        private int index;

        public ProductIterator(ProductHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public Product current() {
            return history.products[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
