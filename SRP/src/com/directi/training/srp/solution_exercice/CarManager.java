package com.directi.training.srp.solution_exercice;

public class CarManager {
    private final CarSerializer _carSerializer;
    private final BestCarLookup _bestCarLookup;
    private final CarDao _carDao;

    public CarManager(CarSerializer carSerializer, BestCarLookup bestCarLookup, CarDao carDao){
        this._carSerializer = carSerializer;
        this._bestCarLookup = bestCarLookup;
        this._carDao = carDao;
    }

    public Car getFromDb(final String carId){
        return this._carDao.getFromDb(carId);
    }

    public Car getBestCar(){
        return this._bestCarLookup.getBestCar();
    }

    public String getCarsNames(){
        return this._carSerializer.getCarsNames();
    }
}
