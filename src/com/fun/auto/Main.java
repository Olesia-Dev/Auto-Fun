package com.fun.auto;

import com.fun.auto.model.Car;
import com.fun.auto.model.Truck;
import com.fun.auto.service.DataGenerator;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = DataGenerator.generateCars();
        for (Car car : cars) {
            System.out.println(car);
        }

        List<Truck> trucks = DataGenerator.generateTrucks();
//        trucks.get(trucks.size() - 1); Get last element
        for (Truck truck : trucks) {
            if (truck.getMaxSpeed() > 130) {
                System.out.println(truck);
            }
        }

        Main.printLastFromLinkedList();
        Main.playWithHashSet(cars);
    }

    private static void printLastFromLinkedList() {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("first");
        strings.add("second");
        System.out.println(strings.getLast());
    }

    private static void playWithHashSet(List<Car> carList) {
        HashSet<Car> rustyBuckets = new HashSet<>();
        rustyBuckets.addAll(carList);
        System.out.println("Passed: " + carList.size());
        System.out.println("Saved: " + rustyBuckets.size());
    }

}
