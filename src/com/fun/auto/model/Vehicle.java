package com.fun.auto.model;

import com.fun.auto.model.part.Engine;

import java.util.Objects;

public abstract class Vehicle {

    private int numberOfWheels;
    private int maxSpeed;
    private String color;
    private Engine engine;

    public Vehicle(){
    }

    public Vehicle(int numberOfWheels, int maxSpeed, String color, Engine engine) {
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.engine = engine;
    }

    public abstract void honk();

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return numberOfWheels == vehicle.numberOfWheels
                && maxSpeed == vehicle.maxSpeed
                && Objects.equals(color, vehicle.color)
                && Objects.equals(engine, vehicle.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfWheels, maxSpeed, color, engine);
    }

    @Override
    public String toString() {
        return "numberOfWheels=" + numberOfWheels +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", engine=" + engine;
    }

}
