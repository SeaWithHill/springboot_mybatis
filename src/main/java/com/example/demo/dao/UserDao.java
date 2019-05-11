package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.UserDemo;

@Mapper
public interface UserDao {

	public List<UserDemo> findAllUser();

	public UserDemo findUserById(int id);

	public boolean updateUserById(UserDemo user);

	public boolean insertUser(UserDemo user);

	public boolean deleteById(int id);
}
