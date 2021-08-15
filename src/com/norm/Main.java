package com.norm;

import com.norm.exercises.state.Bicycling;
import com.norm.exercises.state.DirectionService;
import com.norm.exercises.state.Driving;
import com.norm.exercises.state.Transit;
import com.norm.state.abuse.Stopwatch;

public class Main {

    public static void main(String[] args) {
        var directionService = new DirectionService();
        directionService.setTravelMode(new Driving());
        directionService.calculateEta();
        directionService.calculateDirection();
    }
}
