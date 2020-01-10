package com.example.demo.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.example.demo.login.model.User;
import com.example.demo.login.repository.UserDao;
@Service
public class UserService {
	@Autowired
	UserDao dao;

	public Boolean selectOne(String id,String password) {
		Boolean isbool = dao.selectOne(id, password);
		return isbool;
	}
	public User selectinfo(String id, String password) throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ

		return dao.selectinfo(id, password);
	}
	public List<User> selectMany(String id){

		return dao.selectMany(id);
	}
}
