package com.fun.auto.model.part;

public class Engine {

    private FuelType fuelType;
    private int volume;
    private int numberOfCylinders;

    public Engine(FuelType fuelType, int volume, int numberOfCylinders) {
        this.fuelType = fuelType;
        this.volume = volume;
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType=" + fuelType +
                ", volume=" + volume +
                ", numberOfCylinders=" + numberOfCylinders +
                '}';
    }

}
