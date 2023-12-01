package com.mustapha.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mustapha.enums.Color;
import com.mustapha.enums.Model;
import com.mustapha.interfaces.ICarDao;
import com.mustapha.models.Car;

public class CarDao implements ICarDao {

	private List<Car> cars;

	public CarDao() {
		cars = new ArrayList<>();
		cars.addAll(Arrays.asList(
				new Car(Model.BENZ, false, Color.ASH),
				new Car(Model.BMW, true, Color.BLUE),
				new Car(Model.TESLA, true, Color.BLACK),
				new Car(Model.TOYOTA, false, Color.GREEN),
				new Car(Model.BENZ, false, Color.RED)));
	}

	@Override
	public List<Car> getAllCars() {
		return cars;
	}

	@Override
	public Car removeCar() {
		return cars.remove(cars.size() - 1);
	}

	@Override
	public List<Car> getAvailableElectricCars() {
		return cars.stream()
				   .filter(Car::isElectric).toList();
	}
}
