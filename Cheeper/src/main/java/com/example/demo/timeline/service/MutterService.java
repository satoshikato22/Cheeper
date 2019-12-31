package com.example.demo.timeline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.timeline.domain.Mutter;
import com.example.demo.timeline.repository.MutterDaoJdbc;

@Service
public class MutterService {
	@Autowired
	MutterDaoJdbc dao;

	public List<Mutter> selectMany(String mutterid){

		return dao.selectMany(mutterid);
	}

	public boolean insertTweet(Mutter mutter) {
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
	public boolean insertLike(Mutter mutter) {
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
	public boolean insertDislike(Mutter mutter) {
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
