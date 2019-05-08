package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {

	public List<User> getUsers();

	public User findUserById(int id);

	public boolean updateUserById(User user);

	public boolean insertUser(User user);

	public boolean deleteById(int id);

}
