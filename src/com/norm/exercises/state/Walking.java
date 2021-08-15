package com.norm.exercises.state;

public class Walking implements Service{
    @Override
    public int calculateEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public int calculateDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
