package com.directi.training.srp.solution_exercice;

import java.util.List;

public class BestCarLookup {
    private final List<Car> _cars;

    public BestCarLookup(List<Car> cars){
        this._cars = cars;
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : _cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
