package com.fun.auto;

import com.fun.auto.model.Car;
import com.fun.auto.model.Truck;
import com.fun.auto.service.DataGenerator;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = DataGenerator.generateCars();
        for (Car car : cars) {
            System.out.println(car);
        }

        List<Truck> trucks = DataGenerator.generateTrucks();
        for (Truck truck : trucks) {
            if (truck.getMaxSpeed() > 130) {
                System.out.println(truck);
            }
        }
    }

}
