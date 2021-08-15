package com.norm.exercises.state;

public class DirectionService {

    private Service travelMode;

    public int calculateEta() {
        return travelMode.calculateEta();
    }

    public int calculateDirection() {
        return travelMode.calculateDirection();
    }

    public void setTravelMode(Service travelMode) {
        this.travelMode = travelMode;
    }

    public Service getTravelMode() {
        return travelMode;
    }
}
