package com.example.demo.timeline.repository.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.timeline.domain.Mutter;
import com.example.demo.timeline.repository.MutterDaoJdbc;
@Repository
public class MutterDaoJdbcImpl implements MutterDaoJdbc{
	@Autowired
	JdbcTemplate jdbc;
	@Override
	public List<Mutter> selectMany(Mutter mutterid) throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
		List<Map<String,Object>> getList = jdbc.queryForList("select * from mutter where mutterid = ?",mutterid);

		//結果返却用の変数
				List<Mutter> mutterData = new ArrayList<>();

				for(Map<String,Object> map : getList) {
					Mutter mutter = new Mutter();
					mutter.setUserName((String)map.get("UserName"));
					mutter.setText((String)map.get("text"));

					mutterData.add(mutter);
				}
		return mutterData;
	}

	@Override
	public int insertTweet(Mutter mutter) throws DataAccessException {
		int rowNumber = jdbc.update("insert into mutter(mutterId,password,mutterName,birthday,age,role) values(?,?,?,?,?,?)",
				mutter.getUserName(),mutter.getText());

		return rowNumber;
	}

	@Override
	public int insertLike(Mutter mutter) throws DataAccessException {
		int rowNumber = jdbc.update("insert into mutter(mutterId,password,mutterName,birthday,age,role) values(?,?,?,?,?,?)",
				mutter.getUserName(),mutter.getText());

		return rowNumber;
	}

	@Override
	public int insertDislike(Mutter mutter) throws DataAccessException {
		int rowNumber = jdbc.update("insert into mutter(mutterId,password,mutterName,birthday,age,role) values(?,?,?,?,?,?)",
				mutter.getUserName(),mutter.getText());

		return rowNumber;
	}

}
