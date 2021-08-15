package com.norm.exercises.observer;

public class Demo {
    public static void main(String[] args) {
        var statusBar = new StatusBar();
        var stockListView = new StockListView();

        var stock1 = new Stock("stock1", 10);
        var stock2 = new Stock("stock2", 20);
        var stock3 = new Stock("stock3", 30);

        // the status bar show the popular stock
        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        // stock list view show all stocks
        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);

        // causes both StatusBar and StockListView to get refreshed
        stock2.setPrice(21);

        // Causes only the stockListView to get refreshed. (statusBar
        // is not watching this stock.)
        stock3.setPrice(60);
    }
}
