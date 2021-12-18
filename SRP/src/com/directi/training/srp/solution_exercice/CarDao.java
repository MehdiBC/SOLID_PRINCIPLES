package com.directi.training.srp.solution_exercice;

import java.util.List;

public class CarDao {
    private final List<Car> _cars;

    public CarDao(List<Car> cars){
        this._cars = cars;
    }

    public Car getFromDb(final String carId) {
        for (Car car : _cars) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
}
