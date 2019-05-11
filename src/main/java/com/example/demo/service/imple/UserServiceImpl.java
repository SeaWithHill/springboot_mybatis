package com.example.demo.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserDemo;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;


	@Override
	public boolean deleteById(int id) {
		userDao.deleteById(id);
		return true;
	}

	@Override
	public UserDemo findUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUserById(UserDemo user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertUser(UserDemo user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserDemo> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
