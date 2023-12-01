package com.mustapha.dao;

import java.util.Arrays;
import java.util.List;

import com.mustapha.interfaces.IUserDao;
import com.mustapha.models.User;

public class UserDao implements IUserDao {
	private List<User> users;

	public UserDao() {
		users = Arrays.asList(
				new User("Mustapha"),
				new User("Charles"),
				new User("John"),
				new User("James"));
	}

	@Override
	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public User getUser() {
		return users.get(0);
	}
}
