package com.example.demo.timeline.repository.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.timeline.domain.Cheep;
import com.example.demo.timeline.repository.CheepDaoJdbc;
@Repository
public class CheepDaoJdbcImpl implements CheepDaoJdbc{
	@Autowired
	JdbcTemplate jdbc;
	@Override
	public int insertTweet(Cheep cheep) throws DataAccessException {
		int rowNumber = jdbc.update("insert into Cheep(CheepId,password,CheepName,birthday,age,role) values(?,?,?,?,?,?)",
				cheep.getUserName(),cheep.getText());

		return rowNumber;
	}

	@Override
	public int insertLike(Cheep cheep) throws DataAccessException {
		int rowNumber = jdbc.update("insert into Cheep(CheepId,password,CheepName,birthday,age,role) values(?,?,?,?,?,?)",
				cheep.getUserName(),cheep.getText());

		return rowNumber;
	}

	@Override
	public int insertDislike(Cheep cheep) throws DataAccessException {
		int rowNumber = jdbc.update("insert into Cheep(CheepId,password,CheepName,birthday,age,role) values(?,?,?,?,?,?)",
				cheep.getUserName(),cheep.getText());

		return rowNumber;
	}

	@Override
	public List<Cheep> selectMany(String Cheepid) throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
				List<Map<String,Object>> getList = jdbc.queryForList("select * from Cheep where Cheepid = ?",Cheepid);

				//結果返却用の変数
						List<Cheep> CheepData = new ArrayList<>();

						for(Map<String,Object> map : getList) {
							Cheep Cheep = new Cheep();
							Cheep.setUserName((String)map.get("UserName"));
							Cheep.setText((String)map.get("text"));

							CheepData.add(Cheep);
						}
				return CheepData;
	}

}
