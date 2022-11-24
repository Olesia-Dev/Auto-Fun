package com.fun.auto;

import com.fun.auto.model.Car;
import com.fun.auto.model.Truck;
import com.fun.auto.service.DataGenerator;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = DataGenerator.generateCars();
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(i + ": " + cars.get(i));
        }
//        for (Car car : cars) {
//            System.out.println(car);
//        }

        List<Truck> trucks = DataGenerator.generateTrucks();
//        trucks.get(trucks.size() - 1); Get last element
        for (Truck truck : trucks) {
            if (truck.getMaxSpeed() > 130) {
                System.out.println(truck);
            }
        }

        Main.printLastFromLinkedList();
        Main.playWithHashSet(cars);
        playWithHashMap(trucks);
        iterateThroughCollection(cars);
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

    private static void playWithHashMap(List<Truck> truckList) {
        HashMap<String, Truck> makeToTruckMap = new HashMap<>();
        for (Truck truck : truckList) {
            makeToTruckMap.put(truck.getColor(), truck);
        }
        System.out.println(makeToTruckMap.get("pink"));
    }

    private static void iterateThroughCollection(Collection<Car> collection) {
        Iterator<Car> carIterator = collection.iterator();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.getNumberOfSeats() > 4) {
                System.out.println(car);
            }
        }
    }

}
