package com.example.demo.timeline.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.timeline.domain.Mutter;

public interface MutterDaoJdbc {
	//tweet一覧の取得
	public List<Mutter> selectMany(String mutterid) throws DataAccessException;

	//tweet1件追加
	public int insertTweet(Mutter mutter) throws DataAccessException;

	//tweet1件追加
	public int insertLike(Mutter mutter) throws DataAccessException;

	//tweet1件追加
	public int insertDislike(Mutter mutter) throws DataAccessException;
}
