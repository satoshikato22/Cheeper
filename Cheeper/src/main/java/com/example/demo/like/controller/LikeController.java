package com.example.demo.like.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.like.model.LikeEV;
import com.example.demo.like.model.LikeEVLogic;

@Controller
public class LikeController {
	@Autowired
	ServletContext application;

	@GetMapping("/like")
	public String GetLike(@RequestParam("action")String action) {
		LikeEV likeEV = (LikeEV) application.getAttribute("likeEV");

	    // サイト評価の初期化（初回リクエスト時実行）
	    if (likeEV == null) {
	      likeEV = new LikeEV();
	    }

	    // サイトの評価処理（初回リクエスト時は実行しない）
	    LikeEVLogic likeEVLogic = new LikeEVLogic();
	    if (action != null && action.equals("like")) {
	      likeEVLogic.like(likeEV);
	    } else if (action != null && action.equals("dislike")) {
	      likeEVLogic.dislike(likeEV);
	    }

	    // アプリケーションスコープにサイト評価を保存
	    application.setAttribute("likeEV", likeEV);

		return "mutter/mutter";

	}
}
