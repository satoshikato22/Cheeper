package com.example.demo.login.repository.jdbc;

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

}
