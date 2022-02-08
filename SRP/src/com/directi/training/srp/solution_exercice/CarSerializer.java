package com.directi.training.srp.solution_exercice;

import com.directi.training.srp.solution_exercice.entities.Car;

import java.util.List;

public class CarSerializer implements ICarSerializer {

    public CarSerializer(){
    }
    public String getCarsNames(List<Car> cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(this.getCarName(car));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String getCarName(Car car) {
        return car.getBrand() + car.getModel();
    }
}
