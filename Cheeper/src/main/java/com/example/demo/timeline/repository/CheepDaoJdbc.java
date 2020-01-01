package com.example.demo.timeline.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.timeline.domain.Cheep;

public interface CheepDaoJdbc {
	//tweet一覧の取得
	public List<Cheep> selectMany(String cheepid) throws DataAccessException;

	//tweet1件追加
	public int insertTweet(Cheep cheep) throws DataAccessException;

	//tweet1件追加
	public int insertLike(Cheep cheep) throws DataAccessException;

	//tweet1件追加
	public int insertDislike(Cheep cheep) throws DataAccessException;
}
