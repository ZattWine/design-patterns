package com.norm;

import com.norm.strategy.BlackAndWhiteFilter;
import com.norm.strategy.ImageStore;
import com.norm.strategy.JPEGCompressor;
import com.norm.strategy.PNGCompressor;

public class Main {
    public static void main(String[] args) {
        var imageStore = new ImageStore();
        imageStore.store(
                "a",
                new JPEGCompressor(),
                new BlackAndWhiteFilter()
        );
        imageStore.store(
                "a",
                new PNGCompressor(),
                new BlackAndWhiteFilter()
        );
    }
}
