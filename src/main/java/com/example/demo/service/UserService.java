package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserDemo;

public interface UserService {

	public List<UserDemo> getUsers();

	public UserDemo findUserById(int id);

	public boolean updateUserById(UserDemo user);

	public boolean insertUser(UserDemo user);

	public boolean deleteById(int id);

}
