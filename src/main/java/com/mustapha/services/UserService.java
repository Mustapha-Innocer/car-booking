package com.mustapha.services;

import com.mustapha.interfaces.IUserService;
import com.mustapha.models.Car;
import com.mustapha.models.User;

public class UserService implements IUserService {

	@Override
	public void addCar(User user, Car car) {
		user.getCars().add(car);
	}
}
