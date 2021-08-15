package com.norm.exercises.state;

public class Bicycling implements Service{
    @Override
    public int calculateEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public int calculateDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
