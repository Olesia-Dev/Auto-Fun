package com.fun.auto;

import com.fun.auto.model.Car;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Car Creator console application!");
        Scanner carScanner = new Scanner(System.in);
        Car car = buildCarInConsole(carScanner);

        System.out.println("You have created new car: " + car);
        writeCarIntoFile(car);
    }

    private static Car buildCarInConsole(Scanner scanner) {
        Car car = new Car();
        System.out.println("Please enter number of wheels:");
        car.setNumberOfWheels(Integer.parseInt(scanner.nextLine()));
        System.out.println("Please enter max speed:");
        car.setMaxSpeed(Integer.parseInt(scanner.nextLine()));
        System.out.println("Please enter color:");
        car.setColor(scanner.nextLine());
        System.out.println("Please enter number of seats:");
        car.setNumberOfSeats(Integer.parseInt(scanner.nextLine()));
        System.out.println("Please enter automatic gear:");
        car.setAutomaticGear(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Please enter climate control");
        car.setClimateControl(Boolean.parseBoolean(scanner.nextLine()));
        return car;
    }

    private static void writeCarIntoFile(Car car) {
        File carFile = new File("car.txt");
        try {
            if (carFile.createNewFile()) {
                System.out.println("File created: " + carFile.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter carWriter = new FileWriter(carFile);
            carWriter.write(car.toString());
            carWriter.close();
        } catch (IOException e) {
            System.out.println("File error!");
            e.printStackTrace();
        }
    }

}
