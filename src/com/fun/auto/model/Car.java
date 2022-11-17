package com.fun.auto.model;

import com.fun.auto.model.part.Engine;

public class Car extends Vehicle {

    private int numberOfSeats;
    private boolean automaticGear;
    private boolean climateControl;

    public Car(int numberOfWheels, int maxSpeed, String color, Engine engine,
               int numberOfSeats, boolean automaticGear, boolean climateControl) {
        super(numberOfWheels, maxSpeed, color, engine);
        this.numberOfSeats = numberOfSeats;
        this.automaticGear = automaticGear;
        this.climateControl = climateControl;
    }

    @Override
    public void honk() {
        System.out.print("Beep! Beep!");
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isAutomaticGear() {
        return automaticGear;
    }

    public void setAutomaticGear(boolean automaticGear) {
        this.automaticGear = automaticGear;
    }

    public boolean isClimateControl() {
        return climateControl;
    }

    public void setClimateControl(boolean climateControl) {
        this.climateControl = climateControl;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                ", numberOfSeats=" + numberOfSeats +
                ", automaticGear=" + automaticGear +
                ", climateControl=" + climateControl +
                "}";
    }

}
