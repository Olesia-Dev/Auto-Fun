package com.fun.auto;

import com.fun.auto.model.Car;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Car Creator console application!");
        File carFile = new File("car.txt");
        readOrCreateFile(carFile);
        processConsoleCarCreation(carFile);
    }

    private static void processConsoleCarCreation(File carFile) {
        Scanner carScanner = new Scanner(System.in);
        System.out.println("Let's create a new car?");
        String answer = carScanner.nextLine().toLowerCase();
        switch (answer) {
            case "yes":
                Car additionalCar = buildCarInConsole(carScanner);
                writeCarIntoFile(carFile, additionalCar);
                processConsoleCarCreation(carFile);
                break;
            case "no":
                System.out.println("Ok! Thanks!");
                break;
            default:
                System.out.println("Didn't get your answer...");
                processConsoleCarCreation(carFile);
        }
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

    private static void readOrCreateFile(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists. Those cars are already in the file:");
                Scanner carScanner = new Scanner(file);
                for (int i = 1; carScanner.hasNext(); i++) {
                    System.out.println(i + "\t" + carScanner.nextLine());
                }
            }
        } catch (IOException e) {
            System.out.println("File creation error!");
            e.printStackTrace();
        }
    }

    private static void writeCarIntoFile(File file, Car car) {
        try {
            FileWriter carWriter = new FileWriter(file, true);
            carWriter.write(car.toString() + "\n");
            carWriter.close();
        } catch (IOException e) {
            System.out.println("File writing error!");
            e.printStackTrace();
        }
        System.out.println("File size in bytes: " + file.length());
    }

}
