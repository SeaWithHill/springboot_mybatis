package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;

@Mapper
public interface UserDao {

	public List<User> findAllUser();

	public User findUserById(int id);

	public boolean updateUserById(User user);

	public boolean insertUser(User user);

	public boolean deleteById(int id);
}
