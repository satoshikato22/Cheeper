package com.example.demo.timeline.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.timeline.domain.Cheep;
import com.example.demo.timeline.domain.PostCheepLogic;
import com.example.demo.timeline.service.CheepService;



@Controller
public class CheepController {
	@Autowired
	ServletContext application;
	@Autowired
	CheepService cheepService;

	@GetMapping("/cheep")
	public String GetCheep() {

		List<Cheep> CheepList =
		        (List<Cheep>) application.getAttribute("CheepList");
		if (CheepList == null) {
		      CheepList = new ArrayList<Cheep>();
		      application.setAttribute("CheepList", CheepList);
		    }


		return "Cheep/Cheep";

	}

	@PostMapping("/cheep")
	public String PostMapping(@RequestParam("text")String text) {

		if (text != null && text.length() != 0) {
		      // アプリケーションスコープに保存されたつぶやきリストを取得
		      List<Cheep> cheepList =
		          (List<Cheep>) application.getAttribute("CheepList");

		      // つぶやきをつぶやきリストに追加
		      Cheep cheep = new Cheep();
		      cheep.setText(text);
		      cheep.setUserName("test");
		      PostCheepLogic postCheepLogic = new PostCheepLogic();
		      postCheepLogic.execute(cheep, cheepList);

		      // アプリケーションスコープにつぶやきリストを保存
		      application.setAttribute("cheepList", cheepList);
		    }

		return "cheep/cheep";


	}

}
