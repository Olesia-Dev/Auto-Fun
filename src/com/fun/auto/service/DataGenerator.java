package com.fun.auto.service;

import com.fun.auto.model.Car;
import com.fun.auto.model.Vehicle;
import com.fun.auto.model.part.Engine;
import com.fun.auto.model.part.FuelType;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    static Engine gasEngine = new Engine(FuelType.GAS, 2500, 4);
    static Engine dieselEngine = new Engine(FuelType.DIESEL, 3500, 6);

    public static List<Car> generateCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(4, 120, "blue", gasEngine, 4, true, true));
        cars.add(new Car(4, 100, "yellow", gasEngine, 4, true, false));
        cars.add(new Car(4, 130, "red", dieselEngine, 5, false, true));
        cars.add(new Car(6, 200, "green", dieselEngine, 7, true, true));
        return cars;
    }

}
