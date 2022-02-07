package com.directi.training.srp.solution_exercice;

import com.directi.training.srp.solution_exercice.entities.Car;

import java.util.List;

public interface ICarSerializer {
    String getCarsNames(List<Car> cars);
    String getCarName(Car car);
}
