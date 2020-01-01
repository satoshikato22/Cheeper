package com.example.demo.timeline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.timeline.domain.Cheep;
import com.example.demo.timeline.repository.CheepDaoJdbc;

@Service
public class CheepService {
	@Autowired
	CheepDaoJdbc dao;

	public List<Cheep> selectMany(String mutterid){

		return dao.selectMany(mutterid);
	}

	public boolean insertTweet(Cheep mutter) {
		//insert実行
		int rowNumber = dao.insertTweet(mutter);

		//判定用変数
		boolean result = false;

		if(rowNumber > 0) {
			//insert成功
			result = true;
		}
		return result;

	}
	public boolean insertLike(Cheep mutter) {
		//insert実行
		int rowNumber = dao.insertLike(mutter);

		//判定用変数
		boolean result = false;

		if(rowNumber > 0) {
			//insert成功
			result = true;
		}
		return result;

	}
	public boolean insertDislike(Cheep mutter) {
		//insert実行
		int rowNumber = dao.insertDislike(mutter);

		//判定用変数
		boolean result = false;

		if(rowNumber > 0) {
			//insert成功
			result = true;
		}
		return result;

	}

}
