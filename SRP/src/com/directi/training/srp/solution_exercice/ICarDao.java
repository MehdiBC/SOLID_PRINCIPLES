package com.directi.training.srp.solution_exercice;

import com.directi.training.srp.solution_exercice.entities.Car;

public interface ICarDao {
    Car findCarById(String carId);
}
