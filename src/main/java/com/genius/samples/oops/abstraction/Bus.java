package com.genius.samples.oops.abstraction;

public abstract class Bus implements Vehicle {
    public void getEngineInformation() {
        System.out.println("I am a Bus Engine");
    }

    public void getRouteNumber() {
        System.out.println("Route#4");
    }
}
