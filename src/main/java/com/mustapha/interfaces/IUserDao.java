package com.mustapha.interfaces;

import java.util.List;

import com.mustapha.models.User;

public interface IUserDao {

	List<User> getAllUsers();

	User getUser();
}
