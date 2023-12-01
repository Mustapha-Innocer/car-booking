package com.mustapha.interfaces;

import java.util.List;

import com.mustapha.models.Car;

public interface ICarDao {

	List<Car> getAllCars();

	Car removeCar();

	List<Car> getAvailableElectricCars();

}