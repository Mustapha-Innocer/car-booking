package com.mustapha.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {

	private UUID id;
	private String name;
	private List<Car> cars;

	public User(String name) {
		id = UUID.randomUUID();
		this.name = name;
		cars = new ArrayList<>();
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Car> getCars() {
		return cars;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", cars=" + cars + "]";
	}

}
