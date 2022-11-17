package com.fun.auto.model;

import com.fun.auto.model.part.Engine;

public class Truck extends Vehicle {

    private int cargoVolume;
    private boolean loaded;

    public Truck(int numberOfWheels, int maxSpeed, String color, Engine engine,
                 int cargoVolume, boolean loaded) {
        super(numberOfWheels, maxSpeed, color, engine);
        this.cargoVolume = cargoVolume;
        this.loaded = loaded;
    }

    @Override
    public void honk() {
        System.out.print("Woo! Woo!");
    }

}
