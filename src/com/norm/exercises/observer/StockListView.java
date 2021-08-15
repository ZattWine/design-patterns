package com.norm.exercises.observer;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer{

    private final List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        System.out.println("Stock List View");
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void priceChanged() {
        System.out.println("Price changed - Refreshing StockListView");
        show();
    }
}
