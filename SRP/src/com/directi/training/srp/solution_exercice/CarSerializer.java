package com.directi.training.srp.solution_exercice;

import java.util.List;

public class CarSerializer {
    private final List<Car> _cars;

    public CarSerializer(List<Car> cars){
        this._cars = cars;
    }
    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : _cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
