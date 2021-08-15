package com.norm.exercises.state;

public class Transit implements Service{
    @Override
    public int calculateEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public int calculateDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
