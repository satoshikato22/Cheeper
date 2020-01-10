package com.example.demo.login.repository.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.login.model.User;
import com.example.demo.login.repository.UserDao;
@Repository
public class UserDaoJdbcImpl implements UserDao{
	@Autowired
	JdbcTemplate jdbc;

	@Override
	public Boolean selectOne(String id, String password) throws DataAccessException {
		Boolean isbool = false;
		Map<String,Object> map = jdbc.queryForMap("Select * From m_users where user_id= ? and password = ?",id,password);
		if(map.size() > 0) {
			isbool = true;
		}
		return isbool;
	}

	@Override
	public User selectinfo(String id, String password) throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
		Map<String,Object> map = jdbc.queryForMap("Select * From m_users where user_id= ? and password = ?",id,password);
		//List<user> userinfo = new ArrayList<>();

		//取得したデータを結果返却用のListに格納していく
			User user = new User();
			user.setId((String)map.get("userid"));
			user.setPass((String)map.get("password"));
			return user;
	}

	@Override
	public User updateOne(User user) throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ

		return null;
	}

	@Override
	public List<User> selectMany(String id) throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
		List<Map<String,Object>> getList = jdbc.queryForList("select * from m_users where user_id = ?",id);
		//結果返却用の変数
		List<User> UserDetail = new ArrayList<>();

		//取得したデータを結果返却用のListに格納していく
		for(Map<String,Object> map : getList) {
			User User = new User();
			User.setId((String)map.get("user_id"));
			User.setUser_name((String)map.get("user_name"));
			User.setPass((String)map.get("password"));

			UserDetail.add(User);
		}
		return UserDetail;
	}

}
