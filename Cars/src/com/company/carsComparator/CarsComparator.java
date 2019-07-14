package com.company.carsComparator;

import com.company.carsFiles.Car;

public abstract class CarsComparator {

    public static int compare(Car firstCar, Car secondCar) {
        if (firstCar.fuelConsump > secondCar.fuelConsump) {
            return 1;
        } else if (firstCar.fuelConsump < secondCar.fuelConsump) {
            return -1;
        } else {
            return 0;
        }
    }
}

