package com.example.demo.login.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.login.model.User;

public interface UserDao {
	//userデータの検索
	public Boolean selectOne(String id,String password) throws DataAccessException;
	//Customerテーブルのデータを1件取得し、セッションに登録
	public User selectinfo(String Id,String password) throws DataAccessException;
	//userデータの登録
	public User updateOne(User user)throws DataAccessException;
	//ユーザー詳細の取得
	public List<User> selectMany(String id) throws DataAccessException;
}
