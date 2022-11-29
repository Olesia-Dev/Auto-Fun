package com.fun.auto;

import com.fun.auto.model.Car;

import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Car Creator console application!");
        Scanner carScanner = new Scanner(System.in);
        Car car = new Car( );
        System.out.println("Please enter number of wheels:");
        car.setNumberOfWheels(Integer.parseInt(carScanner.nextLine()));
        System.out.println("Please enter max speed:");
        car.setMaxSpeed(Integer.parseInt(carScanner.nextLine()));
        System.out.println("Please enter color:");
        car.setColor(carScanner.nextLine());
        System.out.println("Please enter number of seats:");
        car.setNumberOfSeats(Integer.parseInt(carScanner.nextLine()));
        System.out.println("Please enter automatic gear:");
        car.setAutomaticGear(Boolean.parseBoolean(carScanner.nextLine()));
        System.out.println("Please enter climate control");
        car.setClimateControl(Boolean.parseBoolean(carScanner.nextLine()));

        // TODO add all car's parameters

        System.out.println("You have created new car: " + car);
    }

}
