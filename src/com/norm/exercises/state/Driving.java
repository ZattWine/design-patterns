package com.norm.exercises.state;

public class Driving implements Service{
    @Override
    public int calculateEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public int calculateDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
